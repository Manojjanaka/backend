package com.example.backend.animals;

import com.example.backend.actions.Flyable;

public abstract class Bird extends LandAnimal implements Flyable {

    private boolean wingsClipped;
    private Flyable flyable;

    public Bird(Flyable flyable) {
        this.flyable = flyable;
    }

    public void fly() {
        if (wingsClipped){
            throw new UnsupportedOperationException("I cannot fly");
        }
        flyable.fly();
    }

    public void setWingsClipped(boolean wingsClipped) {
        this.wingsClipped = wingsClipped;
    }
}
