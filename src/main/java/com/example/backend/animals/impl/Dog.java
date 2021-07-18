package com.example.backend.animals.impl;

import com.example.backend.animals.Animal;

public class Dog extends Animal {
    @Override
    public void sing() {
        System.out.println("Me ow");
    }
}
