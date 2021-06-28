package com.alexanastasyev.spring.aop;

import org.springframework.stereotype.Component;

@Component("universityLibrary")
public class UniversityLibrary extends AbstractLibrary {
    @Override
    public void getBook() {
        System.out.println("Taking a book from UniversityLibrary");
    }

    @Override
    public void returnBook() {
        System.out.println("Returning a book to UniversityLibrary");
    }

    public void getMagazine() {
        System.out.println("Taking a magazine from UniversityLibrary");
    }
}
