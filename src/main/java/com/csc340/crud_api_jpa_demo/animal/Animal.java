package com.csc340.crud_api_jpa_demo.animal;

import jakarta.persistence.*;

@Entity
@Table(name = "animals")
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int animalID;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String habitat;

    @Column(nullable = false)
    private String species;

    @Column(nullable = true)
    private String scientificName;

    @Column(nullable = true)
    private String description;

    public Animal() {}

    public Animal(int animalID, String name, String habitat, String species, String scientificName, String description) {
        this.animalID = animalID;
        this.name = name;
        this.habitat = habitat;
        this.species = species;
        this.scientificName = scientificName;
        this.description = description;
    }

    public Animal(String name, String habitat, String species, String scientificName, String description) {
        this.name = name;
        this.habitat = habitat;
        this.species = species;
        this.scientificName = scientificName;
        this.description = description;
    }


    public Animal(int animalID, String name, String habitat, String species) {
        this.animalID = animalID;
        this.name = name;
        this.habitat = habitat;
        this.species = species;
    }



    //getters and setters are below this line
    public int getAnimalID(){
        return animalID;
    }
    public String getName(){
        return name;
    }
    public String getAnimalSpecies(){
        return species;
    }
    public String getAnimalHabitat(){
        return habitat;
    }


    public void setName(String name){
        this.name = name;
    }
    public void setAnimalSpecies(String species){
        this.species = species;
    }
    public void setAnimalHabitat(String habitat){
        this.habitat = habitat;
    }


}

