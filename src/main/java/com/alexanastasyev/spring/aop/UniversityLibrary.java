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

    public void returnBook() {
        System.out.println("Returning a book from UniversityLibrary");
    }

    public void returnMagazine() {
        System.out.println("Returning a magazine from UniversityLibrary");
    }

    public void addBook() {
        System.out.println("Adding a book from UniversityLibrary");
    }

    public void addMagazine() {
        System.out.println("Adding a magazine from UniversityLibrary");
    }
}
