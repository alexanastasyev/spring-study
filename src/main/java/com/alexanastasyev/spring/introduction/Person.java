package com.alexanastasyev.spring.introduction;

public class Person {
    private final Pet pet;

    public Person(Pet pet) {
        this.pet = pet;
    }

    public void petVoice() {
        System.out.println(pet.say());
    }
}
