package com.example.backend.animals;

public abstract class Bird extends Animal{

    private boolean wingsClipped;

    public void fly() {
        if (wingsClipped){
            throw new UnsupportedOperationException("I cannot fly");
        }
        System.out.println("I am flying");
    }

    public abstract void sing();

    public void setWingsClipped(boolean wingsClipped) {
        this.wingsClipped = wingsClipped;
    }
}
