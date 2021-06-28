package com.alexanastasyev.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AopConfig.class);

        Library library = context.getBean("libraryBean", Library.class);
        library.getBook();

        context.close();
    }
}
