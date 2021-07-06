package com.alexanastasyev.spring.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AroundReturnBookAspect {

    @Around("execution(public String returnBook())")
    public Object aroundReturnBookAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("Trying to return a book...");
        Object targetMethodResult = proceedingJoinPoint.proceed();
        System.out.println("Book successfully returned");
        return targetMethodResult;
    }
}
