package com.example.backend.animals.impl;

import com.example.backend.animals.Animal;
import com.example.backend.animals.Bird;

public class Parrot extends Bird {

    private Animal animal;

    public Parrot(Animal animal) {
        this.animal = animal;
    }

    @Override
    public void sing() {
        if (animal instanceof Dog){
            System.out.println("Woof, woof");
        } else if (animal instanceof Cat){
            System.out.printf("Me ow");
        } else {
            System.out.println("Cock-a-doodle-doo");
        }
    }
}
