package com.alexanastasyev.spring.introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");
        Dog pet1 = context.getBean("pet", Dog.class);
        pet1.setName("Belka");
        Dog pet2 = context.getBean("pet", Dog.class);
        pet2.setName("Strelka");

        System.out.println(pet1.getName());
        System.out.println(pet2.getName());

        context.close();
    }
}
