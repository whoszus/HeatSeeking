package cc.tinker.controller;

import com.google.gson.Gson;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Tinker on 2016/12/16.
 */
@SpringBootApplication
@RestController
@RequestMapping("/auth")
public class Authentication {

    @RequestMapping("/verification.do")
    public String authentication(){

        return new Gson().toJson("{ret:0,msg:'验证通过'}");
    }
}
