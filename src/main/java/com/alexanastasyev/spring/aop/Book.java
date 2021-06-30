package com.alexanastasyev.spring.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("bookBean")
@Scope("prototype")
public class Book {

    @Value("${book.title}")
    private String title;

    @Value("${book.author}")
    private String author;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
