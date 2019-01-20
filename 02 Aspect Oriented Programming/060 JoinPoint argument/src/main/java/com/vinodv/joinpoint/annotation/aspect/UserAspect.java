package com.vinodv.joinpoint.annotation.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;

import java.util.Arrays;

@Aspect
public class UserAspect {

    @Before("execution(* com.vinodv.joinpoint.annotation.service.*.*(..))")
    public void userBeforeAdvice(JoinPoint jp){
        MethodSignature signature = (MethodSignature) jp.getSignature();
        System.out.println("From the @Before of the aspect, advised method parameters: " + Arrays.asList(signature.getParameterNames()));
    }

}
