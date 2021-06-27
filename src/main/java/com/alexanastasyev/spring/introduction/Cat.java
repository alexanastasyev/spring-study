package com.alexanastasyev.spring.introduction;

import org.springframework.stereotype.Component;

@Component("catBean")
public class Cat implements Pet{
    @Override
    public String say() {
        return "Meow-meow";
    }
}
