package com.oxskyff.animal;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Animal implements Comparable<Animal> {

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
        while (true) {
            if (!name.isEmpty() && !name.isBlank()) {
                this.name = name.toUpperCase(); // All the names will be in uppercase to get an accurate natural sorting.
                animalIdentificationNumber = ++counter;
                break;
            } else {
                System.out.println("The name is incorrect, try again.");
                Scanner sc = new Scanner(System.in);
                name = sc.nextLine(); // TODO: Later on implement a menu on main method or a cleaner solution.
            }
        }
    }

    public int getAnimalId() {
        return animalIdentificationNumber;
    }

    public String toString() {
        return String.format("[%s] %s, Number %d", getClass().getSimpleName(), name, animalIdentificationNumber);
    }


    @Override
    public int compareTo(@NotNull Animal o) {
       return name.compareTo(o.getName());
    }
}
