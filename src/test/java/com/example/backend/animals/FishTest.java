package com.example.backend.animals;

import com.example.backend.animals.impl.Clownfish;
import com.example.backend.animals.impl.Shark;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class FishTest {

    @Test
    void fishShouldSwim() {
        Fish fish = Mockito.mock(Fish.class);
        fish.swim();

        Mockito.verify(fish, Mockito.times(1)).swim();
    }


    @Test
    void clownfishShouldMakeJoke() {
        Clownfish clownfish = Mockito.mock(Clownfish.class);
        clownfish.makeJoke();

        Mockito.verify(clownfish, Mockito.times(1)).makeJoke();
    }


    @Test
    void fishShouldEatFish() {
        Shark shark = Mockito.mock(Shark.class);
        final Clownfish fish = new Clownfish();
        shark.eat(fish);

        Mockito.verify(shark, Mockito.times(1)).eat(fish);
    }
}