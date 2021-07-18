package com.example.backend.animals.impl;

import com.example.backend.actions.impl.SwimableImpl;
import com.example.backend.animals.Fish;
import com.example.backend.enums.Color;
import com.example.backend.enums.Size;

public class Shark extends Fish {

    public Shark() {
        super(Color.GRAY, Size.LARGE, new SwimableImpl());
        setName("Shark");
    }

    public void eat(Fish fish){
        System.out.println("Eating "+ fish.getClass().getName());
    }
}
