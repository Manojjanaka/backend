package com.example.backend.animals;

import com.example.backend.actions.Swimable;
import com.example.backend.enums.Color;
import com.example.backend.enums.Size;

public abstract class Fish extends Animal implements Swimable{
    private Color color;
    private Size size;
    private Swimable swimable;

    public Fish(Color color, Size size, Swimable swimable) {
        this.color = color;
        this.size = size;
        this.swimable = swimable;
    }

    @Override
    public void swim() {
        swimable.swim();
    }

    public Color getColor() {
        return color;
    }

    public Size getSize() {
        return size;
    }
}
