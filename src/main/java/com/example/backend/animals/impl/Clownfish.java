package com.example.backend.animals.impl;

import com.example.backend.actions.impl.SwimableImpl;
import com.example.backend.animals.Fish;
import com.example.backend.enums.Color;
import com.example.backend.enums.Size;

public class Clownfish extends Fish {

    public Clownfish() {
        super(Color.ORANGE, Size.SMALL, new SwimableImpl());
        setName("Clownfish");
    }

    public void makeJoke() {
        System.out.println("I am Joking :D");
    }
}
