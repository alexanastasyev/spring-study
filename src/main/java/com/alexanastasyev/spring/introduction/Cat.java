package com.alexanastasyev.spring.introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("catBean")
@Scope("prototype")
public class Cat implements Pet{
    @Override
    public String say() {
        return "Meow-meow";
    }
}
