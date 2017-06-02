package cc.tinker.web.services;

import cc.tinker.entry.annotation.Permission;
import cc.tinker.entry.annotation.RsaKeyRequire;
import cc.tinker.entry.encrypt.AES;
import cc.tinker.entry.encrypt.AESMsgCrypt;
import cc.tinker.web.controller.AuthController;
import cc.tinker.entry.encrypt.RSA;
import cc.tinker.web.entity.RedswordRsaKeyEntity;
import cc.tinker.web.entity.SiteEncodePasswordEntity;
import cc.tinker.web.repository.RedSwordRsaKeyRepository;
import cc.tinker.web.repository.SiteEncodeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import cc.tinker.entry.repository.SearchFilter;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.Map;
import java.util.Random;


/**
 * Created by whoszus on 2017/4/10.
 *
 * @email whoszus@yahoo.com
 */
@Service
@Transactional
public class SiteEncodeService {
    @Autowired
    SiteEncodeRepository siteEncodeRepository;
    @Autowired
    AuthenticationService authenticationService;
    @Autowired
    RedSwordRsaKeyRepository redSwordRsaKeyRepository;
    private static final Logger logger = LoggerFactory.getLogger(AuthController.class);


    /**
     * 构建分页数据
     *
     * @param searchParams
     * @param pageNumber
     * @param pageSize
     * @param sortType
     * @return
     */
    public Page<SiteEncodePasswordEntity>
    getSiteBootstrapTable(Map<String, Object> searchParams, int pageNumber, int pageSize, String sortType) {
        PageRequest pageRequest = SearchFilter.buildPageRequest(pageNumber, pageSize, sortType, "id");
        Specification<SiteEncodePasswordEntity> spec = SearchFilter.buildSpecification(searchParams, new SiteEncodePasswordEntity());
        return siteEncodeRepository.findAll(spec, pageRequest);
    }

    /**
     * 删除
     *
     */
    public void deleteOne(int id) {
        siteEncodeRepository.delete(id);
        //后面改为标志为删除，并不在数据库里面删除掉
//        siteEncodePassword.set
    }


    /**
     * 根据加密方式加密用户密码并保存到数据库
     */
    public void encodeAndSaveData(SiteEncodePasswordEntity siteEncodePasswordEntity, Integer userId) {
        int encodeMethod = siteEncodePasswordEntity.getSiteEncodeMethod();
        if (encodeMethod == 0) {
            encodeMethod = new Random().nextInt(1) + 1;
        }

        switch (encodeMethod) {

            case 1: //RSA
                try {
//                    SiteEncodePasswordEntity siteEncodePasswordEntityToDB = new SiteEncodePasswordEntity();
                    String privateKey = getUserPrivateKey(userId);
                    byte[] encodePasswordString = encodePasswordByPrivateKey(siteEncodePasswordEntity.getPassword(), privateKey);
                    siteEncodePasswordEntity.setSitePasswordEncode(encodePasswordString);
                    siteEncodePasswordEntity.setDecodeCount(0);
                    siteEncodePasswordEntity.setUserId(userId);
                    siteEncodePasswordEntity.setLastDecodeIp("0.0.0.0");
                    siteEncodePasswordEntity.setDecodeCount(0);
                    siteEncodePasswordEntity.setLastDecodeTime(new Date());
                    siteEncodeRepository.save(siteEncodePasswordEntity);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;

            case 2: // AES
                try {
                    SiteEncodePasswordEntity siteEncodePasswordEntityToDB = new SiteEncodePasswordEntity();
                    String AesEncodePassword = AES.aesEncryptString(siteEncodePasswordEntity.getPassword(), "16BytesLengthKey");
                    siteEncodePasswordEntityToDB.setSitePasswordEncode(AesEncodePassword.getBytes());
                    siteEncodePasswordEntityToDB.setDecodeCount(0);
                    siteEncodePasswordEntityToDB.setUserId(userId);
                    siteEncodePasswordEntityToDB.setLastDecodeIp("0.0.0.0");
                    siteEncodePasswordEntityToDB.setDecodeCount(0);
                    siteEncodePasswordEntityToDB.setLastDecodeTime(new Date());
                    siteEncodeRepository.save(siteEncodePasswordEntityToDB);
                } catch (Exception e) {
                    e.printStackTrace();
                }


                break;
            default:
                break;
        }
    }

    /**
     * 根据加密方式解密密码；
     *
     * @param siteEncodePasswordEntity
     * @param userId
     * @return
     */
    public String decodePassword(SiteEncodePasswordEntity siteEncodePasswordEntity, Integer userId) {
        String decodedPassword = null;
        SiteEncodePasswordEntity siteEncodePasswordEntityDB = siteEncodeRepository.findOne(siteEncodePasswordEntity.getId());

        if (siteEncodePasswordEntityDB != null) {
            switch (siteEncodePasswordEntity.getSiteEncodeMethod()) {
                case 1: //RSA
                    try {
                        String publicKey = getUserPublicKey(userId);
                        decodedPassword = decodeByPublicKey(siteEncodePasswordEntityDB.getSitePasswordEncode(), publicKey);
                        siteEncodePasswordEntityDB.setLastDecodeTime(new Date());
                        siteEncodePasswordEntityDB.setDecodeCount(siteEncodePasswordEntityDB.getDecodeCount() + 1);
                        siteEncodeRepository.save(siteEncodePasswordEntityDB);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;

                case 2: //AES
                    try {
                        String sitePassEncoded = new String(siteEncodePasswordEntityDB.getSitePasswordEncode());
                        decodedPassword = AES.aesDecryptString(sitePassEncoded, "16BytesLengthKey");
                        siteEncodePasswordEntityDB.setLastDecodeTime(new Date());
                        siteEncodePasswordEntityDB.setDecodeCount(siteEncodePasswordEntityDB.getDecodeCount() + 1);
                        siteEncodeRepository.save(siteEncodePasswordEntityDB);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                default:
                    break;
            }

        }
        return decodedPassword;
    }


    /**
     * 私钥加密
     *
     * @param password
     * @param privateKey
     * @return
     */
    private String getKeypair(String password, String privateKey) {
        try {
            System.err.println("私钥加密——公钥解密");
            byte[] data = password.getBytes();
            byte[] encodedData = RSA.encryptByPrivateKey(data, privateKey);
            System.out.println("加密后密码：\r\n" + new String(encodedData));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    /**
     * 获取密钥对
     */
    private void getKeys() {
        Map<String, Object> keyMap = null;
        try {
            keyMap = RSA.genKeyPair();
            String publicKey = RSA.getPublicKey(keyMap);
            String privateKey = RSA.getPrivateKey(keyMap);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * 判断当前用户是否已经生成RSA密钥对，并返回私钥
     *
     * @param userId
     * @return
     */
    @RsaKeyRequire
    @Permission
    private String getUserPrivateKey(Integer userId) throws Exception {
//        AuthenticationEntity authenticationEntity = authenticationService.findOne(userId);
        /**
         * 修改存储rsa密钥方式；
         */
        RedswordRsaKeyEntity redswordRsaKeyEntity = redSwordRsaKeyRepository.findOneByUserId(userId);
        String privateKeyDB = null;
        if (redswordRsaKeyEntity != null) {
            if (redswordRsaKeyEntity.getRsaPrivateKey() != "" && redswordRsaKeyEntity.getRsaPrivateKey() != null) {
                privateKeyDB = redswordRsaKeyEntity.getRsaPrivateKey();
                logger.info("获得私钥：" + privateKeyDB);
            }
        } else { //未生成RSA秘钥对，则生成密钥对，并存到数据库；
            redswordRsaKeyEntity = new RedswordRsaKeyEntity();
            Map<String, Object> keyMap = RSA.genKeyPair();
            String publicKey = RSA.getPublicKey(keyMap);
            String privateKey = RSA.getPrivateKey(keyMap);
            redswordRsaKeyEntity.setRsaPrivateKey(privateKey);
            redswordRsaKeyEntity.setRsaPublicKey(publicKey);
            redswordRsaKeyEntity.setKeyHolder(userId);
            redswordRsaKeyEntity.setId(0);
            privateKeyDB = privateKey;
            logger.info("生成私钥：" + privateKeyDB);
            redSwordRsaKeyRepository.save(redswordRsaKeyEntity);
        }

        return privateKeyDB;
    }

    /**
     * encodePasswordByPrivateKey
     * 使用私钥加密密码
     * 1.判断当前用户是否已经生成RSA密钥对，
     * 2.使用用户私钥对密码进行加密；
     * 3.返回加密后的密文；
     *
     * @return
     */
    private byte[] encodePasswordByPrivateKey(String password, String privateKey) throws Exception {
        byte[] data = password.getBytes();
        byte[] encodedData = RSA.encryptByPrivateKey(data, privateKey);
        return encodedData;
    }


    /**
     * 获取用户公钥 ；
     *
     * @param userId
     * @return
     */
    public String getUserPublicKey(Integer userId) {
        RedswordRsaKeyEntity redswordRsaKeyEntity = redSwordRsaKeyRepository.findOneByUserId(userId);
        String publicKeyDB = null;
        if (redswordRsaKeyEntity != null) {
            if (redswordRsaKeyEntity.getRsaPublicKey() != "" && redswordRsaKeyEntity.getRsaPublicKey() != null) {
                publicKeyDB = redswordRsaKeyEntity.getRsaPublicKey();
            } else {
                try {
                    throw new Exception("用户ID:" + userId + "没有生成公钥，无法解密！");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        }

        return publicKeyDB;

    }


    /**
     * 使用用户公钥解密密码；返回解密过后的密码明文；
     *
     * @param encodedPassword
     * @param publicKey
     * @return
     */
    public String decodeByPublicKey(byte[] encodedPassword, String publicKey) {
        System.out.println("encodedPassword      ~~~  " + encodedPassword);
        System.out.println("publicKey    ~~~  " + publicKey);
        String decodedPassword = null;
        try {
            byte[] decodedData = RSA.decryptByPublicKey(encodedPassword, publicKey);
            decodedPassword = new String(decodedData);
            logger.info("解密后 +" + decodedPassword);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return decodedPassword;

    }


}
