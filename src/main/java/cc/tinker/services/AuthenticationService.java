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

    @Autowired
    private AuthenticationDao authenticationDao;
    @Autowired
    private TokenDao tokenDao;

    public String authentication(String key, String value, String token) {
//      1.判断token是否存在且未超期 ？ 更新token超期时间，返回token：销毁token
        if (!token.equals("empty")) {
            TokenEntity tokenEntity = tokenDao.findOneByToken(token,new Date());
            if (tokenEntity != null) {
                if (tokenEntity.getActiveTime().compareTo(new Date()) != -1) {
                    tokenEntity.setActiveTime(DateTimeUtils.getDateByByMinutesInt(new Date(), 20));
                    tokenEntity.setIsEffective(1);
                    tokenDao.save(tokenEntity);
                    return token;
                } else {
                    tokenEntity.setIsEffective(0);
                }
            }
        }

        return generateNewToken(authDB.getId());
    }


    public String register(AuthenticationEntity auth) {
        AuthenticationEntity authenticationEntity = authenticationDao.save(auth);
        auth.setToken(generateNewToken(authenticationEntity.getId()));
        return auth.getToken();
    }


    /**
     * generate a New Token, 在数据库中有效时间为20min;
     *
     * @return token value
     */
    private String generateNewToken(int userId) {
        TokenEntity tokenEntity = new TokenEntity();
        tokenEntity.setUserId(userId);
        tokenEntity.setToken(UUID.randomUUID().toString());
        tokenEntity.setActiveTime(DateTimeUtils.getDateByByMinutesInt(new Date(), 20));
        tokenEntity.setIsEffective(1);
        tokenDao.save(tokenEntity);
        return tokenEntity.getToken();
    }

    /**
     * 判断token存在并未过期；
     * @param token
     * @return
     */
    public TokenEntity isTokenValid(String token) {
        TokenEntity tokenEntity = tokenDao.findOneByToken(token,new Date());
        if(tokenEntity!= null){
            return tokenEntity;
        }
        return null;
    }

    public AuthenticationEntity findOne(Integer userId){
        return authenticationDao.findOne(userId);
    }


}
