package com.hxx.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LogAspect {

    @Pointcut("execution(public * com.hxx.aop.*.*(..))")
    public void pointCut() {
    }

    @Before("pointCut()")
    public void beforeLog(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        System.out.println(name+"before....");
    }

    @After("pointCut()")
    public void afterLog(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        System.out.println(name+"after.....");
    }

    @AfterThrowing(value = "pointCut()", throwing = "exception")
    public void throwLog(JoinPoint joinPoint, Exception exception) {
        System.out.println(exception);
    }

    @AfterReturning(value = "pointCut()", returning = "result")
    public void afterReturn(JoinPoint joinPoint, int result) {
        Object[] args = joinPoint.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println(result + joinPoint.getSignature().getName());
    }
}
