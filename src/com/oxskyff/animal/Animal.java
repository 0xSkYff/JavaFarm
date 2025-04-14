package com.oxskyff.animal;

import org.jetbrains.annotations.NotNull;

public class Animal {
    private String name;
    private int animalIdentificationNumber;
    private static int counter;


    public Animal(@NotNull String name) {
        System.out.println("Animal constructor");
        setName(name);
    }

    static {
        System.out.println("Static constructor");
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (!name.isEmpty() && !name.isBlank()) {
            this.name = name;
            animalIdentificationNumber = ++counter;
        } else {
            System.exit(1); // todo: Add exception handling
        }
    }

    public int getAnimalId() {
        return animalIdentificationNumber;
    }

    public String toString() {
        return String.format("[%s] %s, Number %d", getClass().getSimpleName(), name, animalIdentificationNumber);
    }


}
