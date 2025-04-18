package com.oxskyff.animal;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.Scanner;

public class Animal implements Comparable<Animal>, Comparator<Animal> {
    ////////////////////////////////////////////////////FIELDS//////////////////////////////////////////////////////////////////////////////////////
    private String name;
    private final int animalIdentificationNumber;
    private byte  age;
    private static int counter;

    /////////////////////////////////////////////////////CONSTRUCTORS//////////////////////////////////////////////////////////////////////////////

    private Animal() {
        animalIdentificationNumber = ++counter;
    }

    public Animal(@NotNull String name) {
        this();
        setName(name);
        // If an age is not provided it is understood that the animal is a baby
    }

    public Animal(@NotNull String name, byte age) {
        this();
        setName(name);
        setAnimalAge(age);
    }

    ///////////////////////////////////////////////////GETTERS AND SETTERS//////////////////////////////////////////////////////////////////////////
    public String getName() {
        return name;
    }

    private void setName(String name) {
            if (name.isEmpty() || name.isBlank()) throw new IllegalArgumentException("The name cannot be blank ");
            this.name = name.toUpperCase(); // All the names will be in uppercase to get an accurate natural sorting.
    }

    public int getAnimalId() {
        return animalIdentificationNumber;
    }

    public byte getAnimalAge() {
        return age;
    }

    public void setAnimalAge(byte age) {
        if (age < 0)  throw new IllegalArgumentException("The age can't be a negative number");
        this.age = age;
    }

    ///////////////////////////////////////////////OVERRIDE METHODS////////////////////////////////////////////////////////////////////////////////

    // Sort by ID
    @Override
    public int compareTo(@NotNull Animal o) {
        return Integer.valueOf(animalIdentificationNumber).compareTo(Integer.valueOf(o.animalIdentificationNumber));
    }

    @Override
    public String toString() {
        return String.format("[%s] %s, %d years old, ID: %d", getClass().getSimpleName(), getName(), getAnimalAge() , getAnimalId());
    }

    @Override
    public int compare(Animal o1, Animal o2) {
        return 0;
    }

    // An animal can be the same if it's name and id is the same.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        if (animal.name.equals(this.name) && animal.animalIdentificationNumber == this.animalIdentificationNumber ) return true;
        return false;
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


}
