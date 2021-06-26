package com.alexanastasyev.spring.introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

        Dog dog = context.getBean("pet", Dog.class);
        
        System.out.println(dog.say());

        context.close();
    }
}
