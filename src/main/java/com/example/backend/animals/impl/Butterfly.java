package com.example.backend.animals.impl;

import com.example.backend.actions.Flyable;
import com.example.backend.animals.Insects;

public class Butterfly extends Insects implements Flyable {

    public Butterfly() {
        setName("Butterfly");
    }

    @Override
    public void fly() {
        System.out.println("I am flying");
    }
}
