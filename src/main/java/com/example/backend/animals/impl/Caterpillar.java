package com.example.backend.animals.impl;

import com.example.backend.actions.CanMetamorphosis;
import com.example.backend.animals.Insects;

public class Caterpillar extends Insects implements CanMetamorphosis<Butterfly> {

    private Butterfly butterfly;

    public Butterfly metamorphosis() {
        if (butterfly==null){
            butterfly = new Butterfly();
        }
        return butterfly;
    }
}
