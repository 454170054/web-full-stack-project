package com.jf.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author lzzz
 * @Date 2022-11-06 18:54
 */
@Aspect
@Component
public class MyAspect {

    @Pointcut("@annotation(com.jf.anno.MyAopAnno)")
    public void pt(){}

    //环绕通知
    @Around("pt()")
    public Object myAround(ProceedingJoinPoint pdj) throws Throwable {
        System.out.println("环绕通知开始");
        Object result = pdj.proceed();
        System.out.println("环绕通知执行结束");
        return result;
    }
}
