package com.example.backend.animals;

import com.example.backend.animals.impl.Butterfly;
import com.example.backend.animals.impl.Caterpillar;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class InsectsTest {

    @Test
    void insectsShouldSpeak() {
        var insects = Mockito.mock(Insects.class);
        insects.walk();

        Mockito.verify(insects, Mockito.times(1)).walk();
    }

    @Test
    void butterflyShouldFly() {
        var insects = Mockito.mock(Butterfly.class);
        insects.fly();

        Mockito.verify(insects, Mockito.times(1)).fly();
    }

    @Test
    void caterpillarShouldMetamorphosis() {
        Caterpillar insects = Mockito.mock(Caterpillar.class);
        Mockito.when(insects.metamorphosis())
                .thenReturn(new Butterfly());

        final var metamorphosis = insects.metamorphosis();

        Mockito.verify(insects, Mockito.times(1)).metamorphosis();
        MatcherAssert.assertThat(metamorphosis, CoreMatchers.instanceOf(Butterfly.class));
    }
}