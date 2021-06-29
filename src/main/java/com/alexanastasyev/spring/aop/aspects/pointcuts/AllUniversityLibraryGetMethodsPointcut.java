package com.alexanastasyev.spring.aop.aspects.pointcuts;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AllUniversityLibraryGetMethodsPointcut {
    @Pointcut("execution(* com.alexanastasyev.spring.aop.UniversityLibrary.get*())")
    public void allUniversityLibraryGetMethodsPointcut() {
    }
}
