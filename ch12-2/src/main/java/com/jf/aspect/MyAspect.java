package com.jf.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @Description
 * @Author lzzz
 * @Date 2022-09-25 23:00
 */
public class MyAspect {

    public void myBefore(JoinPoint joinpoint){
        System.out.println("AOP对象: " + joinpoint.getTarget());
        System.out.println("前置通知： 如执行权限检查....");
    }

    public Object myAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕开始：执行目标方法之前，如开启事务：");
        Object proceed = proceedingJoinPoint.proceed();
        System.out.println("环绕结束");
        return proceed;
    }
}
