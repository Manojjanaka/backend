package com.example.backend.animals.impl;

import com.example.backend.animals.Bird;

public class Chicken extends Bird {

    public Chicken() {
        setWingsClipped(true);
    }

    @Override
    public void sing() {
        System.out.println("Cluck, cluck");
    }
}
