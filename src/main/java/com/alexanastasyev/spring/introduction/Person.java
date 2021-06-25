package com.alexanastasyev.spring.introduction;

public class Person {
    private Pet pet;

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void petVoice() {
        System.out.println(pet.say());
    }
}
