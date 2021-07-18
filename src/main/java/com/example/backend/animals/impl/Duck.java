package com.example.backend.animals.impl;

import com.example.backend.actions.Swimable;
import com.example.backend.actions.impl.FlyableImpl;
import com.example.backend.actions.impl.SwimableImpl;
import com.example.backend.animals.Bird;

public class Duck extends Bird implements Swimable {

    private Swimable swimable;

    public Duck() {
        super(new FlyableImpl());
        swimable = new SwimableImpl();
        setName("Duck");
    }

    @Override
    public void speak() {
        System.out.println("Quack , quack");
    }

    public void swim(){
        swimable.swim();
    }
}
