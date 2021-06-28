package com.alexanastasyev.spring.introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("dogBean")
@Scope("prototype")
public class Dog implements Pet {
    @Override
    public String say() {
        return "Bow-Wow";
    }
}
