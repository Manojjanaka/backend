package com.example.backend.animals.impl;

import com.example.backend.animals.LandAnimal;

public class Dog extends LandAnimal {

    public Dog() {
        setName("Dog");
    }

    @Override
    public void speak() {
        System.out.println("Me ow");
    }
}
