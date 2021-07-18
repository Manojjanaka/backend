package com.example.backend.animals.impl;

import com.example.backend.animals.Animal;
import com.example.backend.animals.LandAnimal;

public class Dog extends LandAnimal {
    @Override
    public void speak() {
        System.out.println("Me ow");
    }
}
