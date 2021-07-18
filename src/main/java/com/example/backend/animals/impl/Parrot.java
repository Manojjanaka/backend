package com.example.backend.animals.impl;

import com.example.backend.actions.impl.FlyableImpl;
import com.example.backend.animals.Animal;
import com.example.backend.animals.Bird;

public class Parrot extends Bird {

    private Animal animal;

    public Parrot(Animal animal) {
        super(new FlyableImpl());
        this.animal = animal;
    }

    @Override
    public void sing() {
        animal.sing();
    }
}
