package com.alexanastasyev.spring.aop;

import org.springframework.stereotype.Component;

@Component("schoolLibrary")
public class SchoolLibrary extends AbstractLibrary{
    @Override
    public void getBook() {
        System.out.println("Taking a book from SchoolLibrary");
    }
}
