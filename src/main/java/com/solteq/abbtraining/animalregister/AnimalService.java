package com.solteq.abbtraining.animalregister;

import java.util.Collection;

public interface AnimalService {
    Collection<Animal> getAnimals();
    Animal getAnimal(Integer id);
    Integer saveAnimal(Animal animal);
}
