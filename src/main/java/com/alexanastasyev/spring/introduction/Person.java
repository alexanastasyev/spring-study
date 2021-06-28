package com.alexanastasyev.spring.introduction;

public class Person {
    private Pet pet;

   // @Value("${person.name}")
    private String name;

   // @Value("${person.age}")
    private int age;

    public Person(Pet pet) {
        this.pet = pet;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void petVoice() {
        System.out.println(pet.say());
    }
}
