package cc.tinker.utils;

import org.springframework.beans.factory.annotation.Value;

/**
 * Created by Eagle on 2017/6/28.
 */
public class JzSyncUtils {

    @Value("${jzSyncParam.senderId}")
    private String msg;

}
