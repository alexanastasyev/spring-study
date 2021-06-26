package com.alexanastasyev.spring.introduction;

public class Dog implements Pet {
//    private String name;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

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
