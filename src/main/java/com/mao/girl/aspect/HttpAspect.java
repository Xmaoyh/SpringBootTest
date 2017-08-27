package com.mao.girl.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by MaoYiHan on 2017/8/27.
 */

@Aspect
@Component
class HttpAspect {

    private final static Logger logger = LoggerFactory.getLogger(HttpAspect.class.getName());

    /**
     * 公用方法
     */
    @Pointcut("execution(public * com.mao.girl.controller.GirlController.*(..))")
    public void log() {
    }

    @Before("log()")
    public void doBefore(JoinPoint joinPoint) {
        logger.info("11111111");
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        //url
        logger.info("url={}", request.getRequestURL());
        //method
        logger.info("method={}", request.getMethod());
        //ip
        logger.info("method={}", request.getRemoteAddr());
        //classMethod
        logger.info("classMethod={}", joinPoint.getSignature().getDeclaringType() + "." + joinPoint.getSignature().getDeclaringType().getName());
        //classMethodArgs
        logger.info("args={}", joinPoint.getArgs());
    }

    @After("log()")
    public void doAfter() {
        logger.info("22222222");
    }
}
