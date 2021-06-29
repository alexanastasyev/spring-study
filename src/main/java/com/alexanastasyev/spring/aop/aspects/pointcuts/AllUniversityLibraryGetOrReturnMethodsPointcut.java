package com.alexanastasyev.spring.aop.aspects.pointcuts;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AllUniversityLibraryGetOrReturnMethodsPointcut {
    @Pointcut(
            "com.alexanastasyev.spring.aop.aspects.pointcuts.AllUniversityLibraryGetMethodsPointcut.allUniversityLibraryGetMethodsPointcut() ||" +
                    " com.alexanastasyev.spring.aop.aspects.pointcuts.AllUniversityLibraryReturnMethodsPointcut.allUniversityLibraryReturnMethodsPointcut()"
    )
    public void allUniversityLibraryGetOrReturnMethodsPointcut() {
    }
}
