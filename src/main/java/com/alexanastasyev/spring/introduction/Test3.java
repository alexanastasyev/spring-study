package com.alexanastasyev.spring.introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person = context.getBean("person", Person.class);
        person.petVoice();

        System.out.println(person.getName());
        System.out.println(person.getAge());

        context.close();
    }
}
