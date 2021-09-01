package com.solteq.abbtraining.animalregister;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api/animals")
public class AnimalRestController {

    private final AnimalService animalService;

    @Autowired
    public AnimalRestController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @GetMapping
    public Collection<Animal> getAnimals(Model model) {
        Collection<Animal> animals = animalService.getAnimals();
        return animals;
    }

    @GetMapping("/{id}")
    public Animal getAnimal(Model model, @PathVariable final Integer id) {
        Animal animal = animalService.getAnimal(id);
        return animal;
    }

    @PostMapping
    public Integer saveAnimal(@RequestBody Animal animal) {
        return animalService.saveAnimal(animal);
    }

    @PutMapping("/{id}")
    public Animal updateAnimal(@RequestBody Animal animal, @PathVariable final Integer id) { return animalService.updateAnimal(animal, id); }

    @DeleteMapping("/{id}")
    public Animal deleteAnimal(@PathVariable final Integer id) {
        return animalService.deleteAnimal(id);
    }
}
