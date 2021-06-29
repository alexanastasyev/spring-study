package com.alexanastasyev.spring.aop;

import org.springframework.stereotype.Component;

@Component("universityLibrary")
public class UniversityLibrary extends AbstractLibrary {
    @Override
    public void getBook(Book book) {
        System.out.println("Taking a book from UniversityLibrary: " + book.getName());
    }

    public boolean returnBook() {
        System.out.println("Returning a book to UniversityLibrary");
        return true;
    }

    public void getMagazine(String name) {
        System.out.println("Taking a magazine from UniversityLibrary");
    }
}
