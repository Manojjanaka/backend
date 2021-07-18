package com.example.backend;

import com.example.backend.animals.Bird;
import com.example.backend.animals.impl.Duck;

public class Solution {
    public static void main(String[] args) {
        Bird bird = new Duck();

        bird.walk();
        bird.fly();
        bird.sing();

    }
}