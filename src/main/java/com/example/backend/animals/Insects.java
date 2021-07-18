package com.example.backend.animals;

import com.example.backend.actions.Walkable;

public abstract class Insects extends Animal implements Walkable {

    @Override
    public void walk() {
        System.out.println("I am  walking");
    }
}
