package cc.tinker.controller;

import cc.tinker.services.JZSyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Tinker on 2017/3/14.
 */
@SpringBootApplication
@RestController
@RequestMapping("/jz")
public class JzController {

    @Autowired
    JZSyncService jzSyncService;

    @RequestMapping("/syncSuspects")
    public void getCaseInterface(){
//        jzSyncService.syncSuspects();
    }

}
