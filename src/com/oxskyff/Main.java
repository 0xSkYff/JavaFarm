package com.oxskyff;

import com.oxskyff.animal.Animal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

       List<Animal> listAnimals = new ArrayList<>(
                List.of(new Animal("Leo")
                , new Animal("Bobby")
                , new Animal("Sun"))
        );

        Farm farm1 = new Farm("Sky's Farm", listAnimals);

        System.out.println(farm1);

        Animal a3 = new Animal("Kay");

        farm1.addAnimal(a3);

        System.out.println(farm1);

        Collections.sort(listAnimals);
        System.out.println(listAnimals);


        Animal animal = new Animal("");

    }
}
