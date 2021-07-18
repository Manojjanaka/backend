package com.example.backend.animals.impl;

import com.example.backend.actions.impl.FlyableImpl;
import com.example.backend.animals.Bird;
import com.example.backend.animals.LandAnimal;

public class Parrot extends Bird {

    private LandAnimal animal;

    public Parrot(LandAnimal animal) {
        super(new FlyableImpl());
        this.animal = animal;
        setName(String.format("Parrot with %s", animal.getName()));
    }

    @Override
    public void speak() {
        animal.speak();
    }
}
