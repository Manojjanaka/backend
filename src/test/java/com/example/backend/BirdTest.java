package com.example.backend;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class BirdTest {

    @Test
    void sing() {
        Bird bird = Mockito.mock(Bird.class);
        bird.sing();

        Mockito.verify(bird, Mockito.times(1)).sing();
    }
}