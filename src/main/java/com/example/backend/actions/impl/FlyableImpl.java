package com.example.backend.actions.impl;

import com.example.backend.actions.Flyable;

public class FlyableImpl implements Flyable {
    private boolean wingsClipped;

    @Override
    public void fly() {
        if (wingsClipped){
            throw new UnsupportedOperationException("I cannot fly");
        }
        System.out.println("I am flying");
    }

    public void setWingsClipped(boolean wingsClipped) {
        this.wingsClipped = wingsClipped;
    }
}
