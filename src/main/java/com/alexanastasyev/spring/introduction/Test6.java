package com.alexanastasyev.spring.introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Person person = context.getBean("personBean", Person.class);
        person.petVoice();
        System.out.println(person.getName());
        System.out.println(person.getAge());

        context.close();
    }
}
