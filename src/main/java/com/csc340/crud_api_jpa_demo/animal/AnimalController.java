package com.csc340.crud_api_jpa_demo.animal;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * StudentController.java.
 * Includes all REST API endpoint mappings for the Animal object.
 */
@RestController
@RequestMapping("/animals")
public class AnimalController {

    @Autowired
    private AnimalService service;

    /**
     * Get a list of all Animals in the database.
     * http://localhost:8080/animals/all
     *
     * @return a list of Animal objects.
     */
    @GetMapping("/all")
    public List<Animal> getAllAnimals() {
        return service.getAllAnimals();
    }


    /**
     * Get a list of matching species in the database
     * http://localhost:8080/animals/species
     *
     * @return a lsit of matching species of animals
     * **/
    @GetMapping("/species")
    public List<Animal> getAnimalBySpecies(@RequestParam(name = "species", defaultValue = "unspecified") String species) {
        return service.getAnimalBySpecies(species);
    }

    /**
     * Get a list of matching names of animals in the database
     * http://localhost:8080/animals/name
     *
     * @return a list of matching names of animals
     * **/
    @GetMapping("/name")
        public List<Animal> getAnimalByName(@RequestParam(name="contains", defaultValue="") String name){return service.getAnimalByName(name);}


    /**
     * Get a specific Animal by ID.
     * http://localhost:8080/animals/2
     *
     * @param animalID the unique ID for an Animal.
     * @return One Animal object.
     */
    @PostMapping("/{animalID}")
    public Animal getOneAnimal(@PathVariable int animalID) {
        return service.getAnimalById(animalID);
    }


    /**
     * Create a new Animal entry.
     * http://localhost:8080/animals/new --data '{ "AnimalID": 4, "name": "cat"}'
     *
     * @param animal the new Animal object.
     * @return the updated list of Animals.
     */
    @PostMapping("/new")
    public List<Animal> addNewAnimal(@RequestBody Animal animal) {
        service.addNewAnimal(animal);
        return service.getAllAnimals();
    }

    /**
     * Update an existing Animal object.
     * http://localhost:8080/animals/update/2 --data '{ "animalID": 1, "name": "sampleUpdated"}'
     *
     * @param animalID the unique Animal Id.
     * @param animal   the new update Animal details.
     * @return the updated Animal object.
     */
    @PutMapping("/update/{AnimalID}")
    public Animal updateAnimal(@PathVariable int animalID, @RequestBody Animal animal) {
        service.updateAnimal(animalID, animal);
        return service.getAnimalById(animalID);
    }

    /**
     * Delete an Animal object.
     * http://localhost:8080/animal/delete/2
     *
     * @param animalID the unique Animal Id.
     * @return the updated list of Animal.
     */
    @DeleteMapping("/delete/{animalID}")
    public List<Animal> deleteAnimalById(@PathVariable int animalID) {
        service.deleteAnimalById(animalID);
        return service.getAllAnimals();
    }
}
