package com.example.backend;

import com.example.backend.actions.Flyable;
import com.example.backend.actions.Speakable;
import com.example.backend.actions.Swimable;
import com.example.backend.actions.Walkable;
import com.example.backend.animals.Animal;
import com.example.backend.animals.Bird;
import com.example.backend.animals.impl.*;
import com.example.backend.enums.Gender;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Bird bird = new Duck();

        bird.walk();
        bird.fly();
        bird.speak();


        Animal[] animals = new Animal[]{
                new Duck(),
                new Chicken(Gender.FEMALE),
                new Parrot(new Dog()),
                new Shark(),
                new Clownfish(),
                new Dolphin (),
                new Dog(),
                new Butterfly (),
                new Cat()
        };

        final long flyableAnimals = Arrays.stream(animals).filter(animal -> {
            boolean isFlyable = animal instanceof Flyable;
            if (isFlyable && animal instanceof Bird){
                Bird bird1 = (Bird) animal;
                isFlyable = isFlyable && !bird1.isWingsClipped();
            }
            return isFlyable;
        }).count();
        System.out.println("Animals can fly : " +flyableAnimals);


        final long walkableAnimals = Arrays.stream(animals).filter(animal -> animal instanceof Walkable).count();
        System.out.println("Animals can walk : " +walkableAnimals);


        final long speakableAnimals = Arrays.stream(animals).filter(animal -> animal instanceof Speakable).count();
        System.out.println("Animals can speak : " +speakableAnimals);


        final long swimableAnimals = Arrays.stream(animals).filter(animal -> animal instanceof Swimable).count();
        System.out.println("Animals can swim : " +swimableAnimals);

    }
}