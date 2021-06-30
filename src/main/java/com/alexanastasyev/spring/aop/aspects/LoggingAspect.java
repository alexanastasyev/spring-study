package com.alexanastasyev.spring.aop.aspects;

import com.alexanastasyev.spring.aop.Book;
import com.alexanastasyev.spring.aop.Utils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {
    @Before("com.alexanastasyev.spring.aop.aspects.pointcuts.AllUniversityLibraryGetMethodsPointcut.allUniversityLibraryGetMethodsPointcut()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: trying to get a book/magazine...");
        Utils.printSeparator();
    }

    @Before("com.alexanastasyev.spring.aop.aspects.pointcuts.AllAddMethodsPointcut.allAddMethodsPointcut()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {
        System.out.println("beforeAddLoggingAdvice: trying to add a book...");

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature: " + methodSignature);

        if (methodSignature.getName().equals("addBook")) {
            Object[] arguments = joinPoint.getArgs();
            for (Object obj : arguments) {
                if (obj instanceof Book) {
                    Book book = (Book) obj;
                    System.out.println("Book: \"" + book.getTitle() + "\" " + book.getAuthor());
                }
                else if (obj instanceof String) {
                    String user = (String) obj;
                    System.out.println("User: " + user);
                }
            }
        }

        Utils.printSeparator();
    }

//    @Before("com.alexanastasyev.spring.aop.aspects.pointcuts.AllUniversityLibraryReturnMethodsPointcut.allUniversityLibraryReturnMethodsPointcut()")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("beforeReturnLoggingAdvice: trying to return a book/magazine...");
//    }
//
//    @Before("com.alexanastasyev.spring.aop.aspects.pointcuts.AllUniversityLibraryGetOrReturnMethodsPointcut.allUniversityLibraryGetOrReturnMethodsPointcut()")
//    public void beforeGetOrReturnLoggingAdvice() {
//        System.out.println("generalLoggingAdvice: trying to get or return a book/magazine...");
//    }
}
