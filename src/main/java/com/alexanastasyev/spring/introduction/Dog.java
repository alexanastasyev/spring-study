package com.alexanastasyev.spring.introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("dogBean")
@Scope("prototype")
public class Dog implements Pet {

    private void init() {
        System.out.println("Dog: init");
    }

    private void destroy() {
        System.out.println("Dog: destroy");
    }

    @Override
    public String say() {
        return "Bow-Wow";
    }
}
