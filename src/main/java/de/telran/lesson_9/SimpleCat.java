package de.telran.lesson_9;

import java.util.*;

public class SimpleCat {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Tome", 10);
        Cat cat2 = new Cat("Vasya", 6);
        Cat cat3 = new Cat("Murka", 10);
        Cat cat4 = new Cat("Barsik", 4);
        Cat cat5 = new Cat("Pushok", 8);
        Cat cat6 = new Cat("Slon", 10);

        List<Cat> unMutubleCats1 = List.of(cat1,cat2, cat3, cat4, cat5, cat6);
        System.out.println(unMutubleCats1);


        List<Cat> unmutubleCats2 = List.of(cat1,cat2, cat3, cat4, cat5, cat6);
        System.out.println(unmutubleCats2);


        //unMutubleCats.add(new Cat("Noname", 18)); nelzya vipolnit
       // mutubleCats.add(new Cat("Noname", 18)); nelzya dobavit

        List<Cat> mutubleCats = new ArrayList<>();
        mutubleCats.add(cat1);
        mutubleCats.add(cat2);
        mutubleCats.add(cat3);
        mutubleCats.add(cat4);
        mutubleCats.add(cat5);
        mutubleCats.add(cat6);
        System.out.println(mutubleCats);

        Collections.sort(mutubleCats);
        System.out.println(mutubleCats);


        //may loose data because of CompareTo method;
        Set<Cat> setCats = new TreeSet<>();
        setCats.addAll(unMutubleCats1);
        System.out.println(setCats);
    }
}
