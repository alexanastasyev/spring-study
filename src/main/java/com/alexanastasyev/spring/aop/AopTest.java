package com.alexanastasyev.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AopConfig.class);

        UniversityLibrary universityLibrary = context.getBean("universityLibrary", UniversityLibrary.class);

        universityLibrary.getBook();
        universityLibrary.getMagazine();

//        universityLibrary.returnBook();
//        universityLibrary.returnMagazine();

        context.close();
    }
}
