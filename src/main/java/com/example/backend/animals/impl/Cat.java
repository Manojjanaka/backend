package com.example.backend.animals.impl;

import com.example.backend.animals.Animal;

public class Cat extends Animal {
    @Override
    public void sing() {
        System.out.println("Me ow");
    }
}
