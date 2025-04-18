package com.oxskyff.animal;

import java.util.Comparator;

public class AnimalComparator implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {
        return (o1.getAnimalAge()+ o1.getName()).compareTo(o2.getAnimalAge() + o2.getName()) ;
    }
}
