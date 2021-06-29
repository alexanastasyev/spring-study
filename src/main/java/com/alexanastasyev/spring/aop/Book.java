package com.alexanastasyev.spring.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("bookBean")
@Scope("prototype")
public class Book {
    @Value("${book.name}")
    private String name;

    public String getName() {
        return name;
    }
}
