package com.example.backend.actions.impl;

import com.example.backend.actions.Walkable;

public class WalkableImpl implements Walkable {
    @Override
    public void walk() {
        System.out.println("I am walking");
    }
}
