package com.oxskyff;

import com.oxskyff.animal.Animal;
import com.oxskyff.animal.AnimalComparator;
import com.oxskyff.animal.Horse;
import com.oxskyff.animal.Rabbit;

import java.util.HashMap;

import java.util.*;

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
        Animal a4 = new Animal("Alba");
        Animal a5 = new Animal("Xerneas");
        farm1.addAnimal(a4);


        farm1.addAnimal(a3);
farm1.addAnimal(a5);
        System.out.println(farm1);

        System.out.println(listAnimals);



        List<Animal> animalsFarm1 = farm1.getAnimals();

        for (int i = 0; i <= farm1.getAnimalCount(); i++) {
            System.out.printf("%s is %d, hence %s%n", animalsFarm1.get(i).getName(), animalsFarm1.get(i).getAnimalAge(),
                    (animalsFarm1.get(i).getAnimalAge() < 1 ?
                            "it is a baby" : (animalsFarm1.get(i).getAnimalAge() < 8) ?
                            "It is a child" : (animalsFarm1.get(i).getAnimalAge() >= 9) ?
                            "It is an adult" : ""));
        }

       // System.out.println(a3.compareTo("Marcos"));

        AnimalComparator ac1 = new AnimalComparator();
        List<Animal> animals2 = farm1.getAnimals();
        animals2.sort(ac1);
        System.out.println(animals2);



        Collections.sort(listAnimals, Collections.reverseOrder());
        System.out.println(listAnimals);

        int[] numbers =  {1,23,2,1,323,1213,123,31};
        for (int number : numbers) {
            System.out.println(number);
        }

       Animal a7 = new Animal("A", (byte)21);
        Animal a8 = new Animal("A", (byte) 22);
        System.out.println(a7.equals(a8));
        System.out.println(a7 == a8);

        HashMap<String, String> nicknames = new HashMap<>();

        nicknames.put("Matthew", "Matt");
        nicknames.put("Michael", "Mix");
        nicknames.put("Arthur", "Artie");

        System.out.println(nicknames.get("Matthew"));
        System.out.println(nicknames.get("Matt"));

        System.out.println(a7.equals(null));



        Animal animal1 = new Horse("White");
        Animal animal2 = new Rabbit("Bunny");

        System.out.println(animal1.getClass() == animal2.getClass());

    Animal animal3 = new Animal("Perl");
    Rabbit rabbit = new Rabbit("Perl");
        System.out.println(rabbit.equals(animal3));
        System.out.println(animal3.equals(rabbit));
    }
}
