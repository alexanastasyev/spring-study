package com.alexanastasyev.spring.aop;

import org.springframework.stereotype.Component;

@Component("studentBean")
public class Student {
    public String goToLibrary() {
        return "Student is going to library";
    }
}
