package com.solteq.abbtraining.animalregister;

import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class AnimalServiceImpl implements AnimalService {
private final AnimalRepository animalRepository;

    public AnimalServiceImpl(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    @Override
    public Collection<Animal> getAnimals() {
        return animalRepository.getAnimals();
    }

    @Override
    public Animal getAnimal(Integer id) {
        return animalRepository.getAnimal(id);
    }

    @Override
    public Integer saveAnimal(Animal animal) {
        return animalRepository.saveAnimal(animal);
    }
}
