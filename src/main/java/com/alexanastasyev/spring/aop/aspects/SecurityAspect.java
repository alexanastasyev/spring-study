package com.alexanastasyev.spring.aop.aspects;

import com.alexanastasyev.spring.aop.Utils;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class SecurityAspect {
    @Before("com.alexanastasyev.spring.aop.aspects.pointcuts.AllUniversityLibraryGetMethodsPointcut.allUniversityLibraryGetMethodsPointcut()")
    public void beforeGetSecurityAdvice() {
        System.out.println("beforeGetSecurityAdvice: checking permissions...");
        Utils.printSeparator();
    }
}
