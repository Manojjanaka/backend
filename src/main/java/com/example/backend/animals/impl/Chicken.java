package com.example.backend.animals.impl;

import com.example.backend.animals.Bird;
import com.example.backend.enums.Gender;

public class Chicken extends Bird {

    private Gender gender;

    public Chicken(Gender gender) {
        setWingsClipped(true);
        this.gender = gender;
    }

    @Override
    public void sing() {
        if (gender.equals(Gender.MALE)) {
            System.out.printf("Cock-a-doodle-doo");
        } else {
            System.out.println("Cluck, cluck");
        }
    }
}
