package de.telran.lesson_12.hw2;

import java.util.Map;
import java.util.TreeMap;

public class Task1 {
    //Есть Map, в котором храниться количество жителей по разным городам.
    //Найдите город с самым большим количеством жителей.
    //Найдите среднее количество жителей по всем городам.

    //* Найдите все города, у которых количество жителей одинаковое.

    public static void main(String[] args) {
        Map<String, Integer> map1 = new TreeMap<>();
        map1.put("NewYork",  8000000);
        map1.put("Washington",  671800);
        map1.put("Philly",  650000);
        System.out.println(map1);

        int totalPopulation = 0;
        for (int value : map1.values()) {
            totalPopulation += value;
        }
        double averagePopulation = (double) totalPopulation / map1.size();
        System.out.println("Среднее количество жителей по всем городам: " + averagePopulation);

        String mostPopulousCity = null;
        int maxPopulation = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            if (entry.getValue() > maxPopulation) {
                maxPopulation = entry.getValue();
                mostPopulousCity = entry.getKey();
            }
        }
        if (mostPopulousCity != null) {

            System.out.println("Город с наибольшим количеством жителей: " + mostPopulousCity + " (Количество жителей: " + maxPopulation + ")");
        }


    }
}
