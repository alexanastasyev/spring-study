package com.alexanastasyev.spring.aop.aspects.pointcuts;

import org.aspectj.lang.annotation.Pointcut;

public class AllAddMethodsPointcut {
    @Pointcut("execution(* com.alexanastasyev.spring.aop.UniversityLibrary.add*(..))")
    public void allAddMethodsPointcut() {
    }
}
