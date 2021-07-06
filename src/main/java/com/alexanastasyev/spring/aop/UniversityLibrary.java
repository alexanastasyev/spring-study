package com.alexanastasyev.spring.aop;

import org.springframework.stereotype.Component;

@Component("universityLibrary")
public class UniversityLibrary {
    public void getBook() {
        System.out.println("Taking a book from UniversityLibrary");
        Utils.printSeparator();
    }

    public void getMagazine() {
        System.out.println("Taking a magazine from UniversityLibrary");
        Utils.printSeparator();
    }

    public String returnBook() {
        System.out.println("Returning a book from UniversityLibrary");
        return "War and Piece";
    }

    public void returnMagazine() {
        System.out.println("Returning a magazine from UniversityLibrary");
        Utils.printSeparator();
    }

    public void addBook(String user, Book book) {
        System.out.println("Adding a book to UniversityLibrary");
        Utils.printSeparator();
    }

    public void addMagazine() {
        System.out.println("Adding a magazine to UniversityLibrary");
        Utils.printSeparator();
    }
}
