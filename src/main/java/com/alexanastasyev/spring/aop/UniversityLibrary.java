package com.alexanastasyev.spring.aop;

import org.springframework.stereotype.Component;

@Component("universityLibrary")
public class UniversityLibrary {
    public void getBook() {
        System.out.println("Taking a book from UniversityLibrary");
    }

    public void getMagazine() {
        System.out.println("Taking a magazine from UniversityLibrary");
    }
}
