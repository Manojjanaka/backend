package com.example.backend.controllers;

import com.example.backend.animals.Animal;
import com.example.backend.animals.impl.*;
import com.example.backend.enums.Gender;
import com.example.backend.services.AnimalService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(AnimalController.class)
class AnimalControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private AnimalService animalService;

    @BeforeEach
    public void setUp() {
        List<Animal> animalList = Arrays.asList(
                new Duck(),
                new Chicken(Gender.FEMALE, "Hen"),
                new Parrot(new Dog()),
                new Shark(),
                new Clownfish(),
                new Dolphin (),
                new Dog(),
                new Butterfly (),
                new Cat());

        Mockito.when(animalService.getAllAnimals())
                .thenReturn(animalList);
    }

    @Test
    void getAllAnimals() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.get("/api/animal")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$", hasSize(9)));
    }
}