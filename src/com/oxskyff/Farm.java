package com.oxskyff;

import com.oxskyff.animal.Animal;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    private String name;
    private List<Animal> animals;
    private int animalCount;
    // TODO: Add the list of crops

    public Farm(String name) {
        this.name = name;
        animals = new ArrayList<>();
    }

    public Farm (String name, List<Animal> animals) {
        this.name = name;
        this.animals = animals;
        countAnimals(animals);
    }

    private void countAnimals(List<Animal> animals) {
        animalCount += animals.size();
    }

    public void addAnimal(Animal animal) {
        //TODO: Constraint the parameters
        animals.add(animal);
    }

    public String getNameFarm() {
        return name;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name + "\n");
        for (Animal a : animals) {
            sb.append(a.toString() + "\n");
        }
        return sb.toString();
    }

}
