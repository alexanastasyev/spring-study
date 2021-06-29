package com.alexanastasyev.spring.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    @Before("execution(public void getBook(com.alexanastasyev.spring.aop.Book, ..))")
    public void beforeGetBookAdvice() {
        System.out.println("beforeGetBookAdvice: Trying to get book...");
    }

    @Before("execution(public * returnBook())")
    public void beforeReturnBookAdvice() {
        System.out.println("beforeReturnBookAdvice: Trying to return book...");
    }
}
