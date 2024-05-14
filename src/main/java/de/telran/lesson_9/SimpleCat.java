package de.telran.lesson_9;

import java.util.*;

public class SimpleCat {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Tome", 10,6);
        Cat cat2 = new Cat("Vasya", 6, 7);
        Cat cat3 = new Cat("Murka", 10, 5);
        Cat cat4 = new Cat("Barsik", 4, 9);
        Cat cat5 = new Cat("Pushok", 8, 4);
        Cat cat6 = new Cat("Slon", 10, 8);

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

        // компаратор оценки нескольких вложенных характеристик
        Comparator<Cat> compareCatsAgeWeight = new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                if(o1.getAge() == o2.getAge()) {
                    if(o1.getWeight() == o2.getWeight()) {
                        return o1.getName().compareTo(o2.getName()); // сортировка по имени (дефаулт сортиовка String)
                    }
                    else {
                        return o1.getWeight() - o2.getWeight(); // сортировка по весу
                    }
                }
                else {
                    return o2.getAge() - o1.getAge(); // сортировка по возрасту по убыванию
                }
            }
        };
        Collections.sort(mutubleCats, compareCatsAgeWeight);
        System.out.println(mutubleCats);


        // здесь можете потерять данные, т.к. сравнение идет по compareTo
        Set<Cat> setCats = new TreeSet<>();
        setCats.addAll(unMutubleCats1);
        System.out.println(setCats); // по умолчанию, все коты одного веса считаются одинаковыми

        Set<Cat> setCats1 = new TreeSet<>(compareCatsAgeWeight);
        setCats1.addAll(unMutubleCats1);
        System.out.println(setCats1); // критерии сравнения другие, поэтому данные не теряются.


    }
}
