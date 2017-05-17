package cc.tinker.web.controller;

import cc.tinker.entry.utils.ServletUtils;
import cc.tinker.web.entity.AccessHistoryEntity;
import cc.tinker.web.entity.TokenEntity;
import cc.tinker.web.services.AuthenticationService;
import cc.tinker.web.services.IpAccessService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import cc.tinker.entry.entity.FrontEndResponse;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created by tinker on 2017/5/17.
 */

@RestController
@RequestMapping("/history")
public class AccessController {


    @Autowired
    AuthenticationService authenticationService;
    @Autowired
    IpAccessService ipAccessService;

    @RequestMapping("accessHistory")
    public FrontEndResponse accessHistory() {
        FrontEndResponse frontEndResponse = new FrontEndResponse();


        return frontEndResponse;
    }

    /**
     * 获取用户账户密码列表，根据不同的参数
     */
    @RequestMapping("/accessHistoryList")
    @CrossOrigin
    public Page<AccessHistoryEntity> accessHistoryList(@RequestParam(value = "pageNumber", defaultValue = "1") int pageNumber,
                                        @RequestParam(value = "pageSize", defaultValue = "10") int pageSize,
                                        @RequestParam(value = "sortType", defaultValue = "auto") String sortType,
                                        HttpServletRequest request, @CookieValue(value = "token", defaultValue = "empty") String token) {

        TokenEntity tokenEntity = authenticationService.isTokenValid(token);
        Map<String, Object> conditions = ServletUtils.getParametersStartingWith(request, "condition_");
        Page<AccessHistoryEntity> entityPage = ipAccessService.accessHistoryList(conditions, pageNumber, pageSize, sortType);
        return entityPage;
    }
}
