package cc.tinker.entry.utils;

import javax.servlet.http.HttpServletRequest;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * IP地址工具类
 * @author Abe
 *
 */
public class IPUtils {
    /**
     * 得到本机ip地址
     * @return 返回本机ip地址
     */
    public static String getIp(){
        try {
            return InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return null;
    }
    /**
     * 得到客户端ip地址
     * @param httpRequest
     * @return 返回客户端ip地址
     */
    public static String getIp(HttpServletRequest httpRequest){
        String remoteAddress = httpRequest.getRemoteAddr();
        if(remoteAddress.equals("0:0:0:0:0:0:0:1") || remoteAddress.equals("127.0.0.1")){
            try {
                remoteAddress = InetAddress.getLocalHost().getHostAddress();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return remoteAddress;
    }
}
