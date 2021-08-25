package com.solteq.abbtraining.animalregister;


import java.util.Collection;

public interface AnimalRepository {
    Collection<Animal> getAnimals();
    Animal getAnimal( Integer id);
    Integer saveAnimal(Animal animal);
}
