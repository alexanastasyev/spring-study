package com.alexanastasyev.spring.introduction;

public class Cat implements Pet{
    @Override
    public void say() {
        System.out.println("Meow-meow");
    }
}
