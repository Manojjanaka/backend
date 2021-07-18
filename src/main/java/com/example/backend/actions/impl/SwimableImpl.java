package com.example.backend.actions.impl;

import com.example.backend.actions.Swimable;

public class SwimableImpl implements Swimable {
    @Override
    public void swim() {
        System.out.println("I am swimming");
    }
}
