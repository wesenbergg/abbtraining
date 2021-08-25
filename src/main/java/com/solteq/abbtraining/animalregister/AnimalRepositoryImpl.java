package com.solteq.abbtraining.animalregister;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@Repository
public class AnimalRepositoryImpl implements AnimalRepository{

    private List<Animal> animals = new ArrayList<>();

    @Override
    public Collection<Animal> getAnimals() {
        return animals;
    }

    @Override
    public Animal getAnimal(Integer id) {
        return animals.get(id);
    }

    @Override
    public Integer saveAnimal(Animal animal) {
        animals.add(animal);
        return animals.size() - 1;
    }
}
