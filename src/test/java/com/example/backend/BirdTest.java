package com.example.backend;

import com.example.backend.animals.Bird;
import com.example.backend.animals.impl.Chicken;
import com.example.backend.animals.impl.Duck;
import org.junit.jupiter.api.Assertions;
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

    @Test
    void chickenShouldSing() {
        Chicken chicken = Mockito.mock(Chicken.class);
        chicken.sing();

        Mockito.verify(chicken, Mockito.times(1)).sing();
    }

    @Test
    void chickenShouldNotFly() {

        Chicken chicken = new Chicken();

        Exception exception = Assertions.assertThrows(UnsupportedOperationException.class, chicken::fly);

        Assertions.assertTrue(exception.getMessage().contains("I cannot fly"));
    }
}