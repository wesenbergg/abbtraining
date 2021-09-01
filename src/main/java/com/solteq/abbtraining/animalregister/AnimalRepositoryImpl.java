package com.solteq.abbtraining.animalregister;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Repository
public class AnimalRepositoryImpl implements AnimalRepository{

    private List<Animal> animals = new ArrayList<>();

    public AnimalRepositoryImpl() {
        animals.add(new Animal(0, "Simpanssi"));
        animals.add(new Animal(1, "Ankka"));
        animals.add(new Animal(2, "Biisoni"));
        animals.add(new Animal(3, "Chinchilla"));
        animals.add(new Animal(4, "Dinosaurus"));
        animals.add(new Animal(5, "Etana"));
        animals.add(new Animal(6, "Fasaani"));
        animals.add(new Animal(7,"Gorilla"));
        animals.add(new Animal(8,"Hyena"));
    }
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
        if(animals.get(animal.getId()) == null) {
            animals.add(animal);
        } else {
            updateAnimal(animal, animal.getId());
        }

        return animals.size() - 1;
    }

    @Override
    public Animal updateAnimal(Animal animal, Integer id) {
        return animals.set(id, animal);
    }

    @Override
    public Animal deleteAnimal(Integer id) {
        return animals.remove((int) id);
    }
}
