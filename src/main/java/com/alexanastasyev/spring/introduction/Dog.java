package com.alexanastasyev.spring.introduction;

public class Dog implements Pet {
    @Override
    public String say() {
        return "Bow-Wow";
    }
}
