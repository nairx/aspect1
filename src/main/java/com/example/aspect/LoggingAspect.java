package com.example.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;



@Aspect
@Component
public class LoggingAspect {
    @Before("execution(* com.example.service.*.*(..))")
    public void log(){
        System.out.println("Logging...");
    }
   
    @After("execution(* com.example.service.*.*(..))")
    public void logAfter(){
        System.out.println("After method...");
    }
    @AfterReturning("execution(* com.example.service.*.*(..))")
    public void logSuccess(){
        System.out.println("Method completed successfully...");
    }

    @Around("execution(* com.example.service.*.*(..))")
    public Object measureTime(ProceedingJoinPoint pjp) throws Throwable{
        long start = System.currentTimeMillis();
        Object result = pjp.proceed();
        long end = System.currentTimeMillis();
        System.out.println(pjp.getSignature().getName() + " took " + (end-start) + " ms");
        return result;
    }
}
