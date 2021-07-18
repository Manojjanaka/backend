package com.example.backend.animals;

import com.example.backend.actions.Speakable;
import com.example.backend.actions.Walkable;

public abstract class LandAnimal extends Animal implements Speakable, Walkable {

    @Override
    public void walk() {
        System.out.println("I am  walking");
    }
}
