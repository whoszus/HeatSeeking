package cc.tinker.controller;

import cc.tinker.entity.AuthenticationEntity;
import cc.tinker.services.AuthenticationService;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tinker.entr.entity.FrontEndResponse;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Tinker on 2016/12/16.
 */
@SpringBootApplication
@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    AuthenticationService authService;

    /**
     * 验证用户是否登录，获取用户权限；
     *
     * @param fooCookie
     * @param account
     * @param password
     * @param response
     * @return
     */
    @RequestMapping("/verification.do")
    public FrontEndResponse authentication(@CookieValue(value = "token", defaultValue = "empty") String fooCookie,
                                           String account, String password, HttpServletResponse response) {


        if (authService.authentication(account, password, fooCookie)) {
            return new FrontEndResponse(true);
        } else {
            return new FrontEndResponse(false);
        }
    }

    /**
     * 用户注册接口,根据实体传入参数
     *
     * @param auth
     * @return
     */
    @RequestMapping("/register.do")
    public FrontEndResponse register(@CookieValue(value = "token", defaultValue = "empty") String token, AuthenticationEntity auth, HttpServletResponse response) {
        //验证用户是否存在
//      1. 首先
        Map map = authService.register(auth);
        if((boolean)map.get("success")){
            Cookie responseCookie = new Cookie("token", (String) map.get("token"));
            responseCookie.setPath("/");
            responseCookie.setMaxAge(2000);
            response.addCookie(responseCookie);
            System.out.println(token);
            AuthenticationEntity authenticationEntityDB = (AuthenticationEntity) map.get("auth");
            return new FrontEndResponse(true, authenticationEntityDB.getUserName());
        }else {
            return  new FrontEndResponse(false,"Email已存在");
        }

    }


    @RequestMapping("/login")
    public void login(AuthenticationEntity auth) {

    }


}
