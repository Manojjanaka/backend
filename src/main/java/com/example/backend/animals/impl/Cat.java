package com.example.backend.animals.impl;

import com.example.backend.animals.LandAnimal;

public class Cat extends LandAnimal {

    public Cat() {
        setName("Cat");
    }

    @Override
    public void speak() {
        System.out.println("Me ow");
    }
}
