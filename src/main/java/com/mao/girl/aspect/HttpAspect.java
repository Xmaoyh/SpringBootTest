package com.mao.girl.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by MaoYiHan on 2017/8/27.
 */

@Aspect
@Component
class HttpAspect {

    /**
     * 公用方法
     */
    @Pointcut("execution(public * com.mao.girl.controller.GirlController.*(..))")
    public void log() {
    }

    @Before("log()")
    public void doBefore() {
        System.out.println("11111111");
    }

    @After("log()")
    public void doAfter() {
        System.out.println("22222222");
    }
}
