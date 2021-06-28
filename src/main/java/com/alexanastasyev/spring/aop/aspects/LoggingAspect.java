package com.alexanastasyev.spring.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    @Before("execution(public void com.alexanastasyev.spring.aop.UniversityLibrary.getBook())")
    public void beforeGetBookAdvice() {
        System.out.println("beforeGetBookAdvice: Trying to get book...");
    }
}
