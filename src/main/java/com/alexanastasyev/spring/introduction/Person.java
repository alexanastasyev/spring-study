package com.alexanastasyev.spring.introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
    // @Autowired
    private Pet pet;

    private String name;
    private int age;

    @Autowired
    public Person(Pet pet) {
        this.pet = pet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void petVoice() {
        System.out.println(pet.say());
    }
}
