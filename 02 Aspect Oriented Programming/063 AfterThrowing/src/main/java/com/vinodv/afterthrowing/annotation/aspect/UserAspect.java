package com.vinodv.afterthrowing.annotation.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class UserAspect {

    @Pointcut("execution(* com.vinodv.afterthrowing.annotation.service.*.*(..))")
    private void pointcut(){}

    @AfterThrowing(pointcut = "pointcut()", throwing = "exception")
    public void adviceForExceptionThrowing(ProceedingJoinPoint pjp, Exception exception) throws Throwable {
        System.out.println("Using @AfterThrowing annotation");

        System.out.println("###### " + exception.getMessage() + " ######");
    }

}
