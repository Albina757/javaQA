package de.telran.lesson_14;

import java.util.*;
import java.util.stream.*;

public class hw14 {


    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> strings = Arrays.asList("Apple", "Banana", "Cherry", "Date", "Elderberry", "Fig", "Grape", "Apple", "Banana", "Cherry");

        // Задание 1: Фильтрация списка целых чисел на нечетные числа
        List<Integer> oddNumbers = numbers.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toList());

        // Задание 2: Фильтрация четных чисел и умножение на 2
        List<Integer> evenNumbersDoubled = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .collect(Collectors.toList());

        // Задание 3: Фильтрация чисел больше 50 и вывод их квадратов
        List<Integer> squaresOver50 = numbers.stream()
                .filter(n -> n > 50)
                .map(n -> n * n)
                .collect(Collectors.toList());

        // Задание 4: Удаление дубликатов из списка строк
        List<String> uniqueStrings = strings.stream()
                .distinct()
                .collect(Collectors.toList());

        // Задание 5: Пропуск первых двух элементов и вывод оставшихся
        List<Integer> skipFirstTwo = numbers.stream()
                .skip(2)
                .collect(Collectors.toList());

        // Задание 6: Преобразование списка строк в список чисел
        List<Integer> stringLengths = strings.stream()
                .map(String::length)
                .collect(Collectors.toList());

        // Задание 7: Суммирование списка чисел
        int sum = numbers.stream()
                .reduce(0, Integer::sum);

        // Задание 8: Определение максимального значения в списке
        Optional<Integer> max = numbers.stream()
                .max(Integer::compare);

        // Задание 9: Фильтрация строк, начинающихся на "A" и преобразование в верхний регистр
        List<String> startsWithAUpperCase = strings.stream()
                .filter(s -> s.startsWith("A"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        // Задание 10: Сортировка списка чисел в порядке убывания и выбор первых трех элементов
        List<Integer> topThreeDescending = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .collect(Collectors.toList());

        // Задание 11: Фильтрация списка строк на те, которые начинаются с определенной буквы и преобразование их в верхний регистр
        // Предположим, что буква - "C"
        List<String> startsWithCUpperCase = strings.stream()
                .filter(s -> s.startsWith("C"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        // Задание 12: Получение списка уникальных слов из списка строк, длина которых больше 4 символов
        List<String> uniqueWordsLongerThan4 = strings.stream()
                .filter(s -> s.length() > 4)
                .distinct()
                .collect(Collectors.toList());

        // Задание 13: Нахождение суммы чисел, кратных 3 и 5, из списка чисел
        int sumMultiplesOf3And5 = numbers.stream()
                .filter(n -> n % 3 == 0 && n % 5 == 0)
                .reduce(0, Integer::sum);
    }
}

