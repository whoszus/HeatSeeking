/*
 *   Copyright <2015-2016> <tinker>

     Permission is hereby granted, free of charge, to any person obtaining a copy of this software
     and associated documentation files (the "Software"),to deal in the Software without restriction,
     including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense,
     and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so,
     subject to the following conditions:

     The above copyright notice and this permission notice shall be included in all copies or substantial
     portions of the Software.

     THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT
     LIMITED TO THE WARRANTIES OF MERCHANTABILITY,FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN
     NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
     WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
     SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
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
