package com.example.backend;

import com.example.backend.animals.Bird;
import com.example.backend.animals.impl.Duck;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class BirdTest {

    @Test
    void birdShouldSing() {
        Bird bird = Mockito.mock(Bird.class);
        bird.sing();

        Mockito.verify(bird, Mockito.times(1)).sing();
    }

    @Test
    void duckShouldSing() {
        Duck duck = Mockito.mock(Duck.class);
        duck.sing();

        Mockito.verify(duck, Mockito.times(1)).sing();
    }

    @Test
    void duckShouldSwim() {
        Duck duck = Mockito.mock(Duck.class);
        duck.swim();

        Mockito.verify(duck, Mockito.times(1)).swim();
    }
}