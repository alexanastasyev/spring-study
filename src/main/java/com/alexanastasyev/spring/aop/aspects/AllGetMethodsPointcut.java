package com.alexanastasyev.spring.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AllGetMethodsPointcut {
    @Pointcut("execution(* get*())")
    public void allGetMethods(){}
}
