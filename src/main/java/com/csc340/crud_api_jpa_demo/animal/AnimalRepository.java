package com.csc340.crud_api_jpa_demo.animal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Provides the actual database transactions.
 */
@Repository
public interface AnimalRepository  extends JpaRepository<Animal, Integer> {

    List<Animal> getAnimalBySpecies(String species);

    List<Animal> getAnimalByName(String name);

}


