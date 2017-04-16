package cc.tinker.services;

import cc.tinker.EncoderUtils.RSAUtils;
import cc.tinker.entity.SiteEncodePasswordEntity;
import cc.tinker.repository.SiteEncodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tinker.entr.repository.SearchFilter;

import java.security.*;
import java.util.Map;


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
     * 根据加密方式加密用户密码并保存到数据库
     */
    public void encodeAndSaveData(SiteEncodePasswordEntity siteEncodePasswordEntity) {
        if (siteEncodePasswordEntity.getSiteEncodeMethod() != 0) {
            switch (siteEncodePasswordEntity.getSiteEncodeMethod()) {
                case 1: //RSA

                    break;
                default:
                    break;
            }
        }
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
            byte[] encodedData = RSAUtils.encryptByPrivateKey(data, privateKey);
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
            keyMap = RSAUtils.generateKeyPair();
            String publicKey = RSAUtils.getPublicKey(keyMap);
            String privateKey = RSAUtils.getPrivateKey(keyMap);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 使用私钥加密密码
     * 1.判断当前用户是否已经生成RSA密钥对，
     * 2.使用用户私钥对密码进行加密；
     * 3.返回加密后的密文；
     * @return
     */
    private String  enCodePasswordAOP(){

        return null;
    }



}
