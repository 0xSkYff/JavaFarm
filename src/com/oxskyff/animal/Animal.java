package com.oxskyff.animal;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Animal implements Comparable<Animal> {
    ////////////////////////////////////////////////////FIELDS//////////////////////////////////////////////////////////////////////////////////////
    private String name;
    private int animalIdentificationNumber;
    private byte  age;
    private static int counter;

    /////////////////////////////////////////////////////CONSTRUCTORS//////////////////////////////////////////////////////////////////////////////
    public Animal(@NotNull String name) {
        setName(name);
        // If an age is not provided it is understood that the animal is a baby
    }

    public Animal(@NotNull String name, byte age) {
        setName(name);
        setAnimalAge(age);
    }

    ///////////////////////////////////////////////////GETTERS AND SETTERS//////////////////////////////////////////////////////////////////////////
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

    public byte getAnimalAge() {
        return age;
    }

    public void setAnimalAge(byte age) {
        if (age >=0) {
            this.age = age; //TODO: Add exception if it is negative or really big
        }
    }

    ///////////////////////////////////////////////OVERRIDE METHODS////////////////////////////////////////////////////////////////////////////////

    @Override
    public int compareTo(@NotNull Animal o) {
        return name.compareTo(o.getName());
    }

    @Override
    public String toString() {
        return String.format("[%s] %s, %d years old, ID: %d", getClass().getSimpleName(), getName(), getAnimalAge() , getAnimalId());
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


}
