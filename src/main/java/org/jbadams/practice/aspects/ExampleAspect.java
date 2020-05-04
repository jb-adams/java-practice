package org.jbadams.practice.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/*
@Aspect
public class ExampleAspect {

    // @Around("@annotation(LogExecutionTime)")
    @Before("execution(* org.jbadams.practice.aspects.Sleeper.*(..))")
    public void logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("HELLO");
        System.err.println("GOODBYE");
        long start = System.currentTimeMillis();
        Object proceed = joinPoint.proceed();
        long executionTime = System.currentTimeMillis() - start;
        System.out.println(joinPoint.getSignature() + " executed in " + executionTime + "ms");
        // return proceed;
    }
}
*/