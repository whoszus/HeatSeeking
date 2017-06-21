package cc.tinker.controller;

import cc.tinker.entity.JzCaseDetail;
import cc.tinker.service.JzCaseExternalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tinker.entr.entity.FrontEndResponse;

import java.util.List;

/**
 * Created by Eagle on 2017/6/2.
 */
@RestController
@RequestMapping("/jz")
public class JzSyncController {

    @Autowired
    JzCaseExternalService jzCaseExternalService;



    @RequestMapping("/syncCaseByCaseCode")
    public List syncCaseByCaseCode(String caseCode){

        return jzCaseExternalService.syncCaseDetailByCode(caseCode);
    }

    @RequestMapping("/syncCaseDetail")
    public List syncCaseDetail(String dataString){

        return jzCaseExternalService.syncDetail(dataString);
    }

    @RequestMapping("/syncCaseByCondition")
    public List syncCaseByCondition(String condition,String value){
        return jzCaseExternalService.syncDetailByCondition(condition+"="+value);
    }

}
