package cc.tinker.services;

import cc.tinker.entity.AuthenticationEntity;
import cc.tinker.entity.TokenEntity;
import cc.tinker.repository.AuthenticationDao;
import cc.tinker.repository.TokenDao;
import cc.tinker.utils.DateTimeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Tinker on 2016/12/16.
 */
@Service
@Transactional
public class AuthenticationService {

    @Autowired private AuthenticationDao authenticationDao;
    @Autowired private TokenDao tokenDao;


    public String authentication(AuthenticationEntity authenticationEntity){

        // decode md5
        AuthenticationEntity authDB = authenticationDao.authByNameAndPsw(authenticationEntity.getClientName(),authenticationEntity.getPassword());

        if(authDB!=null){
            authDB.setToken(getToken());
            return  authDB.getToken();
        }
        return null;
    }


    public String register(AuthenticationEntity auth){
        auth.setToken(getToken());
        authenticationDao.save(auth);
        return auth.getToken();
    }




    private String getToken(){
        TokenEntity tokenEntity = new TokenEntity();
        tokenEntity.setTokern(UUID.randomUUID().toString());
        tokenEntity.setActiveTime(new Date());
        tokenEntity.setIsEffective(1);
        tokenDao.save(tokenEntity);
        return tokenEntity.getTokern();
    }
}
