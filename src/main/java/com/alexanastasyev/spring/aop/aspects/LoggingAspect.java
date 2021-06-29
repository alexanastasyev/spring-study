package com.alexanastasyev.spring.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    @Before("com.alexanastasyev.spring.aop.aspects.pointcuts.AllUniversityLibraryGetMethodsPointcut.allUniversityLibraryGetMethodsPointcut()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: trying to get a book/magazine...");
    }

    @Before("com.alexanastasyev.spring.aop.aspects.pointcuts.AllUniversityLibraryReturnMethodsPointcut.allUniversityLibraryReturnMethodsPointcut()")
    public void beforeReturnLoggingAdvice() {
        System.out.println("beforeReturnLoggingAdvice: trying to return a book/magazine...");
    }

    @Before("com.alexanastasyev.spring.aop.aspects.pointcuts.AllUniversityLibraryGetOrReturnMethodsPointcut.allUniversityLibraryGetOrReturnMethodsPointcut()")
    public void beforeGetOrReturnLoggingAdvice() {
        System.out.println("generalLoggingAdvice: trying to get or return a book/magazine...");
    }
}
