package cc.tinker.controller;

import cc.tinker.entity.AuthenticationEntity;
import cc.tinker.services.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping("/verification.do")
    public Map authentication(@CookieValue(value = "token",defaultValue = "empty")String fooCookie,
                              String account,String password,HttpServletResponse response){
        Map map = new HashMap<>();
        String uuid = authService.authentication(account,password,fooCookie);
        map.put("ret",0);
        map.put("token",uuid);
        Cookie responseCookie = new Cookie("token", uuid);
        responseCookie.setMaxAge(2000);
        response.addCookie(responseCookie);
        return map;
    }

    @RequestMapping("/register.do")
    public Map register(AuthenticationEntity auth){
        Map map = new HashMap<>();
        String uuid = authService.register(auth);

        map.put("ret",0);
        map.put("token",uuid);

        return map;
    }





}
