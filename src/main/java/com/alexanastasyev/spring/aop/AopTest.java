package com.alexanastasyev.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AopConfig.class);

        UniversityLibrary universityLibrary = context.getBean("universityLibrary", UniversityLibrary.class);
        Book book = context.getBean("bookBean", Book.class);

        universityLibrary.addBook("alex", book);
        universityLibrary.addMagazine();
        universityLibrary.getBook();

//        universityLibrary.returnBook();
//        universityLibrary.returnMagazine();

        context.close();
    }
}
