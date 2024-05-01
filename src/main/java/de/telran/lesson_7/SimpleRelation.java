package de.telran.lesson_7;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class SimpleRelation {
    public static void main(String[] args) {

        List<Integer> listArray = new ArrayList<>();
        List<Integer> listLinked = new LinkedList<>();

        // Добавление в хвост
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            listArray.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("ArrayList add Last,  time = " + (end - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            listLinked.add(i);
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedList add Last,  time = " + (end - start));


        // Добавление в середину

        start = System.currentTimeMillis();

        for (int i = 0; i < 100_000; i++) {
            listArray.add(100_000, i);
        }
        end = System.currentTimeMillis();
        System.out.println("ArrayList add Middle,  time = " + (end - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            listArray.add(100_000, i);
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedList add Middle,  time = " + (end - start));

    }


}

