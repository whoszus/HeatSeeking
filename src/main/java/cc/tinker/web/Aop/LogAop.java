package cc.tinker.web.Aop;

import cc.tinker.entry.annotation.Permission;
import cc.tinker.web.controller.AuthController;
import cc.tinker.web.entity.AccessHistoryEntity;
import cc.tinker.web.entity.TokenEntity;
import cc.tinker.web.services.AuthenticationService;
import cc.tinker.web.services.IpAccessService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.util.WebUtils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;
import java.util.*;

/**
 * Created by Tinker on 2016/12/19.
 */

@Aspect
@Component
public class LogAop {

    @Autowired
    IpAccessService ipAccessService;

    @Autowired
    AuthenticationService authenticationService;

    @Value("${spring.profiles}")
    private String env;

//    方法一：
//    private Logger logger = Logger.getLogger(getClass());

    private static final Logger logger = LoggerFactory.getLogger(AuthController.class);

    @Pointcut("execution(public * cc.tinker.web.controller..*(..)) && @annotation(org.springframework.web.bind.annotation.RequestMapping)")
    public void webLog() {
    }


    /**
     * 切点前；
     *
     * @param joinPoint
     * @throws Throwable
     */
    @Before("webLog()")
    public void doBefore(JoinPoint joinPoint) throws Throwable {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        logger.info("URL : " + request.getRequestURL().toString());
        logger.info("HTTP_METHOD : " + request.getMethod());
        logger.info("IP : " + request.getRemoteAddr());
        logger.info("CLASS_METHOD : " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        logger.info("ARGS : " + Arrays.toString(joinPoint.getArgs()));

    }

    /**
     * 返回后
     *
     * @param ret
     * @throws Throwable
     */
    @AfterReturning(returning = "ret", pointcut = "webLog()")
    public void doAfterReturning(Object ret) throws Throwable {
        // 处理完请求，返回内容
        logger.info("RESPONSE : " + ret);
    }


    @Around("webLog()")
    public Object Interceptor(ProceedingJoinPoint proceedingJoinPoint) {
        long beginTime = System.currentTimeMillis();
        MethodSignature signature = (MethodSignature) proceedingJoinPoint.getSignature();
        Method method = signature.getMethod(); //获取被拦截的方法
        String methodName = method.getName(); //获取被拦截的方法名

        Set<Object> allParams = new LinkedHashSet<>(); //保存所有请求参数，用于输出到日志中

        logger.info("请求开始，方法：{}", methodName);

        Object result = null;

        Object[] args = proceedingJoinPoint.getArgs();
        for (Object arg : args) {
            if (arg instanceof Map<?, ?>) {
                //提取方法中的MAP参数，用于记录进日志中
                @SuppressWarnings("unchecked")
                Map<String, Object> map = (Map<String, Object>) arg;

                allParams.add(map);
            } else if (arg instanceof HttpServletRequest) {
                HttpServletRequest request = (HttpServletRequest) arg;


                AccessHistoryEntity accessHistoryEntity = new AccessHistoryEntity();
                accessHistoryEntity.setAccessDateTime(new Date());
                accessHistoryEntity.setAccessParams(proceedingJoinPoint.getSignature().getDeclaringTypeName() + "." + proceedingJoinPoint.getSignature().getName());
                accessHistoryEntity.setIpAddress(request.getRemoteAddr());
                accessHistoryEntity.setIsRefuse(0);
                accessHistoryEntity.setSysMethodName(methodName);

                /**
                 * 日志记录黑名单ip访问；
                 */
                if (!ipAccessService.IpAccessRecord(request.getRemoteAddr())) {
                    logger.warn("黑名单ip" + request.getRemoteAddr() + "执行了" + methodName + "方法");
                    accessHistoryEntity.setIsRefuse(1);
                }
                ipAccessService.saveAccessHistory(accessHistoryEntity);

                /**
                 * 访问方法是否需要登录；
                 */
                if (isLoginRequired(method)) {
                    if (!isLogin(request)) {
                        result = null;
                    }
                }

            }
        }

        try {
            if (result == null) {
                result = proceedingJoinPoint.proceed();
            }
        } catch (Throwable e) {
            logger.info("exception: ", e);
        }

        if (result instanceof String) {
            long costMs = System.currentTimeMillis() - beginTime;
            logger.info("{}请求结束，耗时：{}ms", methodName, costMs);
        }

        return result;
    }

    /**
     * 判断一个方法是否需要登录
     *
     * @param method
     * @return
     */
    private boolean isLoginRequired(Method method) {
        if (!env.equals("production")) {
            return false;
        }

        boolean result = true;
        if (method.isAnnotationPresent(Permission.class)) {
            result = method.getAnnotation(Permission.class).authRequire();
        }
        return result;
    }


    /**
     * 判断是否登录；
     *
     * @param request
     * @return
     */
    private boolean isLogin(HttpServletRequest request) {
        Cookie cookie = WebUtils.getCookie(request, "token");
        if (cookie != null) {
            String token = cookie.getValue();
            TokenEntity tokenEntity = authenticationService.isTokenValid(token);
            if (tokenEntity != null) {
                authenticationService.updateTokenValidTime(tokenEntity);
                return true;
            } else {
                return false;
            }
        }
        return false;
    }


}

