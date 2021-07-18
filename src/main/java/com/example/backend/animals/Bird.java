package com.example.backend.animals;

public abstract class Bird extends Animal{
    public void fly() {
        System.out.println("I am flying");
    }

    public abstract void sing();
}
