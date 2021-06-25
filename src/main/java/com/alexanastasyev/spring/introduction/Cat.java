package com.alexanastasyev.spring.introduction;

public class Cat implements Pet{
    @Override
    public String say() {
        return "Meow-meow";
    }
}
