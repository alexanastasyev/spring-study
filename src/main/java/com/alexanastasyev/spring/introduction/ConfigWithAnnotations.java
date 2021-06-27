package com.alexanastasyev.spring.introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person = context.getBean("personBean", Person.class);
        person.petVoice();
        System.out.println(person.getName());
        System.out.println(person.getAge());

        context.close();
    }
}
