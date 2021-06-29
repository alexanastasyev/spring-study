package com.alexanastasyev.spring.aop;

import org.springframework.stereotype.Component;

@Component("schoolLibrary")
public class SchoolLibrary extends AbstractLibrary{
    @Override
    public void getBook(Book book) {
        System.out.println("Taking a book from SchoolLibrary: " + book.getName());
    }

    public void returnBook() {
        System.out.println("Returning a book to SchoolLibrary");
    }
}
