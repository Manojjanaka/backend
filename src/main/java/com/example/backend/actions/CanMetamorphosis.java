package com.example.backend.actions;

import com.example.backend.animals.Animal;

public interface CanMetamorphosis<T extends Animal> {
    T metamorphosis();
}
