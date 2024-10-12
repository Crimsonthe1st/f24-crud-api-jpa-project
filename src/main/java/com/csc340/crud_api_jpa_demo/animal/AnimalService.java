package com.csc340.crud_api_jpa_demo.animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * AnimalService.java
 * Centralizes data access to the Animal Database.
 */
@Service
public class AnimalService {

    @Autowired
    private AnimalRepository animalRepository;


    /**
     * Fetch all Animals.
     *
     * @return the list of all Animals.
     */
    public List<Animal> getAllAnimals() {
        return animalRepository.findAll();
    }

    /**
     * Fetch a unique animal.
     *
     * @param animalID the unique Animal id.
     * @return a unique Animal object.
     */
    public Animal getAnimalById(int animalID) {
        return animalRepository.findById(animalID).orElse(null);
    }

    /**
     * Add a new Animal to the database.
     *
     * @param animal the new Animal to add.
     */
    public void addNewAnimal(Animal animal) {
        animalRepository.save(animal);
    }

    /**
     * Update an existing Animal.
     *
     * @param animalID the unique Animal Id.
     * @param animal   the new animal details.
     */
    public void updateAnimal(int animalID, Animal animal) {
        Animal existing = getAnimalById(animalID);
        existing.setName(animal.getName());

        animalRepository.save(existing);
    }

    /**
     * Delete a unique Animal.
     *
     * @param animalID the unique Animal ID.
     */
    public void deleteAnimalById(int animalID) {
        animalRepository.deleteById(animalID);
    }

    /**
     * Get all animals of a given species.
     *
     * @param species the species you wish to search for.
     */
    public List<Animal> getAnimalBySpecies(String species) {
        return animalRepository.getAnimalBySpecies(species);
    }

    /**
     * Get animals whose name contains a matching string.
     *
     * @param name the string to be used for searching animal names.
     */
    public List<Animal> getAnimalByName(String name) {
        return animalRepository.getAnimalByName(name);

    }

}