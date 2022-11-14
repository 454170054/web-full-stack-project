package com.js.dao.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @Description
 * @Author lzzz
 * @Date 2022-09-25 21:45
 */
@Slf4j
public class MyAspect implements MethodInterceptor {

    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        // 执行目标方法
        Object obj = methodInvocation.proceed();
        log.info(methodInvocation.getMethod().getName());
        return obj;
    }
}
