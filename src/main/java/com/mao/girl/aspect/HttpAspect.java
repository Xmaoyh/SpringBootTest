package com.mao.girl.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by MaoYiHan on 2017/8/27.
 */

@Aspect
@Component
class HttpAspect {

    @Before("execution(public * com.mao.girl.controller.GirlController.*(..))")
    public void log(){
        System.out.println("111");
    }
}
