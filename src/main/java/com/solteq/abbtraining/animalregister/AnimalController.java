package com.solteq.abbtraining.animalregister;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/animals")
public class AnimalController {

    private final AnimalService animalService;

    @Autowired
    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @GetMapping
    public Collection<Animal> getAnimals() {
        return animalService.getAnimals();
    }

    @GetMapping("/{id}")
    public Animal getAnimal(@PathVariable final Integer id) {
        return animalService.getAnimal(id);
    }

    @PostMapping
    public Integer saveAnimal(@RequestBody Animal animal) {
        return animalService.saveAnimal(animal);
    }
}
