package de.telran.homeWorks;

import java.util.Collections;
import java.util.List;
import java.util.Arrays;

import java.util.ArrayList;

public class hw2 {


    public static void main(String[] args) {
        // Создаем ArrayList с числами
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);

        // 1. Найти сумму всех элементов ArrayList.
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Сумма всех элементов: " + sum);

        // 2. Найти среднее значение элементов ArrayList.
        double average = sum / (double) numbers.size();
        System.out.println("Среднее значение элементов: " + average);

        // 3. Перебрать ArrayList и найти наименьший элемент.
        int min = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        System.out.println("Наименьший элемент: " + min);


        // 4. Перебрать ArrayList и найти сумму квадратов всех элементов.
        int sumOfSquares = 0;
        for (int number : numbers) {
            sumOfSquares += number * number;
        }
        System.out.println("Сумма квадратов всех элементов: " + sumOfSquares);

        // *5. Перебрать ArrayList и удалить все четные числа.
        List<Integer> oddNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 != 0) {
                oddNumbers.add(number);
            }
        }
        numbers = oddNumbers;
        System.out.println("ArrayList после удаления всех четных чисел: " + numbers);

        // *6. Перебрать ArrayList и найти второй по величине элемент.


            List<Integer> numlist = Arrays.asList(9, -8, 5, 4, 1, 7, 3, 2, 6);
            int highestnum = numlist.get(0);
            int secondhighest = numlist.get(0);
            for (int numarr : numlist) {
                if (highestnum < numarr) {
                    secondhighest = highestnum;
                    highestnum = numarr;
                } else if (secondhighest < numarr && highestnum != numarr) {
                    secondhighest = numarr;
                } else if (secondhighest == highestnum) {
                    secondhighest = numarr;
                }
            }
            System.out.println( " :: Second Highest : " + secondhighest);
        }
    }







