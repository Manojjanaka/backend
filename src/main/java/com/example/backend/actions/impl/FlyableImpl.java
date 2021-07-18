package com.example.backend.actions.impl;

import com.example.backend.actions.Flyable;

public class FlyableImpl implements Flyable {

    @Override
    public void fly() {
        System.out.println("I am flying");
    }
}
