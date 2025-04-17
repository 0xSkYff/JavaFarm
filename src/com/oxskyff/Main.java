package com.oxskyff;

import com.oxskyff.animal.Animal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

       List<Animal> listAnimals = new ArrayList<>(
                List.of(new Animal("Leo", (byte) 28)
                , new Animal("Bobby", (byte) 1)
                , new Animal("Sun", (byte) 7))
        );

        Farm farm1 = new Farm("Sky's Farm", listAnimals);

        System.out.println(farm1);

        Animal a3 = new Animal("Kay");

        farm1.addAnimal(a3);

        System.out.println(farm1);

        Collections.sort(listAnimals);
        System.out.println(listAnimals);



        List<Animal> animalsFarm1 = farm1.getAnimals();

        for (int i = 0; i <= farm1.getAnimalCount(); i++) {
            System.out.printf("%s is %d, hence %s%n", animalsFarm1.get(i).getName(), animalsFarm1.get(i).getAnimalAge(),
                    (animalsFarm1.get(i).getAnimalAge() < 1 ?
                            "it is a baby" : (animalsFarm1.get(i).getAnimalAge() < 8) ?
                            "It is a child" : (animalsFarm1.get(i).getAnimalAge() >= 9) ?
                            "It is an adult" : ""));
        }

    }
}
