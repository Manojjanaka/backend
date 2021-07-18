package com.example.backend.animals;

import com.example.backend.animals.impl.Chicken;
import com.example.backend.animals.impl.Duck;
import com.example.backend.animals.impl.Parrot;
import com.example.backend.enums.Gender;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class BirdTest {

    @Test
    void birdShouldSpeak() {
        Bird bird = Mockito.mock(Bird.class);
        bird.speak();

        Mockito.verify(bird, Mockito.times(1)).speak();
    }

    @Test
    void duckShouldSpeak() {
        Duck duck = Mockito.mock(Duck.class);
        duck.speak();

        Mockito.verify(duck, Mockito.times(1)).speak();
    }

    @Test
    void duckShouldSwim() {
        Duck duck = Mockito.mock(Duck.class);
        duck.swim();

        Mockito.verify(duck, Mockito.times(1)).swim();
    }

    @Test
    void chickenShouldSpeak() {
        Chicken chicken = Mockito.mock(Chicken.class);
        chicken.speak();

        Mockito.verify(chicken, Mockito.times(1)).speak();
    }

    @Test
    void chickenShouldNotFly() {

        Chicken chicken = new Chicken(Gender.FEMALE, "Hen");

        Exception exception = Assertions.assertThrows(UnsupportedOperationException.class, chicken::fly);

        Assertions.assertTrue(exception.getMessage().contains("I cannot fly"));
    }

    @Test
    void parrotShouldSpeak() {
        Parrot parrot = Mockito.mock(Parrot.class);
        parrot.speak();

        Mockito.verify(parrot, Mockito.times(1)).speak();

    }
}