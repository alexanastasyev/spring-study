package com.alexanastasyev.spring.introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
    // @Autowired
    // @Qualifier("dogBean")
    private Pet pet;

    @Value("${person.name}")
    private String name;

    @Value("${person.age}")
    private int age;

    @Autowired
    public Person(@Qualifier("dogBean") Pet pet) {
        this.pet = pet;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void petVoice() {
        System.out.println(pet.say());
    }
}
