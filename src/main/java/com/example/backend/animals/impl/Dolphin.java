package com.example.backend.animals.impl;

import com.example.backend.actions.Swimable;
import com.example.backend.actions.impl.SwimableImpl;
import com.example.backend.animals.Animal;

public class Dolphin extends Animal implements Swimable {

    private Swimable swimable = new SwimableImpl();

    @Override
    public void swim() {
        swimable.swim();
    }
}
