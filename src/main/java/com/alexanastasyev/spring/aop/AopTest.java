package com.alexanastasyev.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AopConfig.class);

        UniversityLibrary library = context.getBean("universityLibrary", UniversityLibrary.class);
        String bookName = library.returnBook();
        System.out.println("Book name: " + bookName);

        context.close();
    }
}
