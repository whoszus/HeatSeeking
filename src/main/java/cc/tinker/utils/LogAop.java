package cc.tinker.utils;

import cc.tinker.annotation.Permission;
import cc.tinker.controller.AuthController;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Tinker on 2016/12/19.
 */

@Aspect
@Component
public class LogAop {

    @Value("${spring.profiles}")
    private String env;

//    方法一：
//    private Logger logger = Logger.getLogger(getClass());

    private static final Logger logger = LoggerFactory.getLogger(AuthController.class);

//    @Pointcut("execution( public * cc.tinker.controller.*.*(..))")
    @Pointcut("execution(public * cc.tinker.controller..*(..)) && @annotation(org.springframework.web.bind.annotation.RequestMapping)")
    public void webLog(){

    }


    /**
     * 切点前；
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
     *  返回后
     * @param ret
     * @throws Throwable
     */
    @AfterReturning(returning = "ret", pointcut = "webLog()")
    public void doAfterReturning(Object ret) throws Throwable {
        // 处理完请求，返回内容
        logger.info("RESPONSE : " + ret);
    }



    @Around("webLog()")
    public Object Interceptor(ProceedingJoinPoint proceedingJoinPoint){
        long beginTime = System.currentTimeMillis();
        MethodSignature signature = (MethodSignature) proceedingJoinPoint.getSignature();
        Method method = signature.getMethod(); //获取被拦截的方法
        String methodName = method.getName(); //获取被拦截的方法名

        Set<Object> allParams = new LinkedHashSet<>(); //保存所有请求参数，用于输出到日志中

        logger.info("请求开始，方法：{}", methodName);

        Object result = null;

        Object[] args = proceedingJoinPoint.getArgs();
        for(Object arg : args){
            if (arg instanceof Map<?, ?>) {
                //提取方法中的MAP参数，用于记录进日志中
                @SuppressWarnings("unchecked")
                Map<String, Object> map = (Map<String, Object>) arg;

                allParams.add(map);
            }else if(arg instanceof HttpServletRequest){
                HttpServletRequest request = (HttpServletRequest) arg;
                if(isLoginRequired(method)){
                    if(!isLogin(request)){
                        result = null;
                    }
                }

                //获取query string 或 posted form data参数
                Map<String, String[]> paramMap = request.getParameterMap();
                if(paramMap!=null && paramMap.size()>0){
                    allParams.add(paramMap);
                }
            }else if(arg instanceof HttpServletResponse){
            }else{
            }
        }

        try {
            if(result == null){
                result = proceedingJoinPoint.proceed();
            }
        } catch (Throwable e) {
            logger.info("exception: ", e);
        }

        if(result instanceof String){
            long costMs = System.currentTimeMillis() - beginTime;
            logger.info("{}请求结束，耗时：{}ms", methodName, costMs);
        }

        return result;
    }

    /**
     * 判断一个方法是否需要登录
     * @param method
     * @return
     */
    private boolean isLoginRequired(Method method){
        if(!env.equals("production")){
            return false;
        }

        boolean result = true;
        if(method.isAnnotationPresent(Permission.class)){
            result = method.getAnnotation(Permission.class).authRequire();
        }
        return result;
    }

    //判断是否已经登录
    private boolean isLogin(HttpServletRequest request) {
        return true;
        /*String token = XWebUtils.getCookieByName(request, WebConstants.CookieName.AdminToken);
        if("1".equals(redisOperator.get(RedisConstants.Prefix.ADMIN_TOKEN+token))){
            return true;
        }else {
            return false;
        }*/
    }


}

