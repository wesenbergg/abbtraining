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

    @Override
    public Animal updateAnimal(Animal animal, Integer id) {
        return animalRepository.updateAnimal(animal, id);
    }

    @Override
    public Animal deleteAnimal(Integer id) {
        return animalRepository.deleteAnimal(id);
    }
}
