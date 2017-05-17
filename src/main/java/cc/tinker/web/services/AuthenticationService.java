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
package cc.tinker.web.services;

import cc.tinker.web.entity.AuthenticationEntity;
import cc.tinker.web.entity.TokenEntity;
import cc.tinker.web.repository.AuthenticationDao;
import cc.tinker.web.repository.TokenDao;
import cc.tinker.entry.utils.DateTimeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

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

    /**
     * 验证用户名密码；
     *
     * @param key
     * @param value
     * @return
     */
    public AuthenticationEntity authentication(String key, String value) {
        AuthenticationEntity authenticationEntity = authenticationDao.authByNameAndPsw(key, value);
        if (authenticationEntity != null) {
            //      1.判断token是否存在且未超期 ？ 更新token超期时间，返回token：销毁token
            List<TokenEntity> tokenEntityList = tokenDao.findOneByUserId(authenticationEntity.getId());
            if(tokenEntityList.size()>0){
                String token = tokenEntityList.get(0).getToken();
                if (!token.equals("")) {
                    TokenEntity tokenEntity = tokenDao.findOneByToken(token, new Date());
                    if (tokenEntity != null) {
                        tokenEntity.setActiveTime(DateTimeUtils.getDateByByMinutesInt(new Date(), 20));
                        tokenEntity.setIsEffective(1);
                        tokenDao.save(tokenEntity);
                    }
                }
            }

        }
        return authenticationEntity;
    }

    /**
     * 用户注册
     *
     * @param auth
     * @return
     */
    public Map register(AuthenticationEntity auth) {
        /**
         * 1. 判断用户是否存在
         */
        String newToken = "";
        Map map = new HashMap();
        AuthenticationEntity authenticationEntityDB = authenticationDao.authByNameAndPsw(auth.getUserName(), auth.getUserEmail());
        if (authenticationEntityDB == null) {
            AuthenticationEntity authenticationEntity = authenticationDao.save(auth);
            newToken = generateNewToken(authenticationEntity.getId());
            map.put("success", true);
            map.put("token", newToken);
            map.put("auth", auth);
        } else {
            map.put("success", false);
            map.put("token", "");
            map.put("auth", null);
        }
        return map;
    }


    /**
     * generate a New Token, 在数据库中有效时间为20min;
     *
     * @return token value
     */
    public String generateNewToken(int userId) {
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
     *
     * @param token
     * @return
     */
    public TokenEntity isTokenValid(String token) {
        TokenEntity tokenEntity = tokenDao.findOneByToken(token, new Date());
        if (tokenEntity != null) {
            return tokenEntity;
        }
        return null;
    }

    public AuthenticationEntity findOne(Integer userId) {
        return authenticationDao.findOne(userId);
    }

    public void saveAuthEntity(AuthenticationEntity authenticationEntity) {
        authenticationDao.save(authenticationEntity);
    }

    public void updateTokenValidTime(TokenEntity tokenEntity) {
        if (tokenEntity != null) {
            TokenEntity tokenEntityDB = tokenDao.findOneToken(tokenEntity.getToken());
            tokenEntityDB.setActiveTime(DateTimeUtils.getDateByByDaysInt(new Date(), 10));
            tokenDao.save(tokenEntityDB);
        }
    }

}
