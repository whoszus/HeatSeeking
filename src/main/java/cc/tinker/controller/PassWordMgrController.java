package cc.tinker.controller;

import cc.tinker.entity.SiteEncodePasswordEntity;
import cc.tinker.entity.TokenEntity;
import cc.tinker.services.AuthenticationService;
import cc.tinker.services.SiteEncodeService;
import com.google.gson.Gson;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import tinker.entr.entity.FrontEndResponse;
import tinker.entr.utils.ServletUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created by Tinker on 2017/4/10.
 */
@RestController
@RequestMapping("/passwordMgr")
public class PassWordMgrController {

    @Autowired
    SiteEncodeService siteEncodeService;

    @Autowired
    AuthenticationService authenticationService;
    /**
     * 创建、修改用户密码记录；
     *
     * @param siteEncode
     * @return
     */
    @RequestMapping("/encryptPsw")
    @CrossOrigin
    public FrontEndResponse encryptPsw(@CookieValue(value = "token",defaultValue = "empty") String token,
                                  SiteEncodePasswordEntity siteEncode) {
        TokenEntity tokenEntity = authenticationService.isTokenValid(token);
        if(tokenEntity!=null){
            //获取用户id；

            siteEncodeService.encodeAndSaveData(siteEncode,tokenEntity.getUserId());

            return new FrontEndResponse(true);
        }else{
            return  new FrontEndResponse(false,"你的token不存在或已超时，请重新登录");
        }
    }

    /**
     * 删除用户密码记录
     */
    @RequestMapping("/deletePsw")
    @CrossOrigin
    public FrontEndResponse deleteSiteEncode(SiteEncodePasswordEntity siteEncode) {
        siteEncodeService.deleteOne(siteEncode);
        return new FrontEndResponse(true);
    }

    /**
     * 获取用户账户密码列表，根据不同的参数
     */
    @RequestMapping("/getSiteBootstrapTable")
    @CrossOrigin
    public JSONObject getSiteBootstrapTable(@RequestParam(value = "pageNumber", defaultValue = "1") int pageNumber,
                                        @RequestParam(value = "pageSize", defaultValue = "10") int pageSize,
                                        @RequestParam(value = "sortType", defaultValue = "auto") String sortType,
                                        HttpServletRequest request) {

        Map<String, Object> conditions = ServletUtils.getParametersStartingWith(request, "condition_");
        Page<SiteEncodePasswordEntity> entityPage = siteEncodeService.getSiteBootstrapTable(conditions, pageNumber, pageSize, sortType);
        return JSONObject.fromObject(entityPage);
    }


    /**
     * 解密密码；
     * @param token
     * @param siteEncode
     * @return
     */
    @RequestMapping("/decodePassword")
    @CrossOrigin
    public FrontEndResponse decodePassword(@CookieValue(value = "token", defaultValue = "empty") String token, SiteEncodePasswordEntity siteEncode){
        TokenEntity tokenEntity = authenticationService.isTokenValid(token);
        if(tokenEntity!=null){
            //获取用户id；
            return new FrontEndResponse(true,siteEncodeService.decodePassword(siteEncode,tokenEntity.getUserId()));
        }else{
            return  new FrontEndResponse(false,"你的token不存在或已超时，请重新登录");
        }
    }

}
