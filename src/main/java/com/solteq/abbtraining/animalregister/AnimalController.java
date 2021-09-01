package com.solteq.abbtraining.animalregister;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
@RequestMapping("/animals")
public class AnimalController {

    private final AnimalService animalService;

    @Autowired
    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @GetMapping
    public String getAnimals(Model model) {
        Collection<Animal> animals = animalService.getAnimals();
        model.addAttribute("animals", animals);
        return "animals";
    }

    @GetMapping("/update")
    public String updateAnimalPage(@RequestParam("animalId") Integer id, Model model) {
        Animal animal = animalService.getAnimal(id);
        model.addAttribute("animal", animal);
        
        return "new-animal";
    }

    @GetMapping("/new")
    public String addAnimalPage(Model model) {
        Animal animal = new Animal();
        animal.setId(animalService.getAnimals().size());
        
        model.addAttribute("animal", animal);
        return "new-animal";
    }

    @PostMapping("/new")
    public String saveAnimal(@ModelAttribute("animal") Animal animal) {
        animalService.saveAnimal(animal);
        return "redirect:/animals";
    }

    @GetMapping("animal")
    public String getAnimal(Model model, @RequestParam("id") Integer id) {
        Animal animal = animalService.getAnimal(id);
        model.addAttribute("animal", animal);
        return "single-animal";
    }

    @GetMapping("/delete")
    public String deleteAnimal(@RequestParam("id") Integer id) {
        animalService.deleteAnimal(id);
        return "redirect:/animals";
    }
}
