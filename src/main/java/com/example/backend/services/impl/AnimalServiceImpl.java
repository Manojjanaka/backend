package com.example.backend.services.impl;

import com.example.backend.animals.Animal;
import com.example.backend.animals.impl.*;
import com.example.backend.enums.Gender;
import com.example.backend.services.AnimalService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnimalServiceImpl implements AnimalService {

    List<Animal> animalList;

    public AnimalServiceImpl() {
        animalList = new ArrayList<>();
        animalList.add(new Duck());
        animalList.add(new Chicken(Gender.FEMALE, "Hen"));
        animalList.add(new Parrot(new Dog()));
        animalList.add(new Shark());
        animalList.add(new Clownfish());
        animalList.add(new Dolphin ());
        animalList.add(new Dog());
        animalList.add(new Butterfly ());
        animalList.add(new Cat());
    }

    @Override
    public List<Animal> getAllAnimals() {
        return animalList;
    }
}
