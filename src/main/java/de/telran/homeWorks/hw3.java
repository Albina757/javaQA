package de.telran.homeWorks;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class hw3 {
    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();

        //add to tail

        list.add(5);
        list.add(8);
        list.add(2);
        list.add(9);
        list.addLast(7);// ravnoznachno s add

        System.out.println(list);
    }

//Найти среднее значение элементов LinkedList

    public double findAverage(LinkedList<Integer> list) {
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return (double) sum / list.size();
    }

    //Перебрать LinkedList и найти самую длинную строку:

    public String findLongestString(LinkedList<String> list) {
        String longestString = "";
        for (String str : list) {
            if (str.length() > longestString.length()) {
                longestString = str;
            }
        }
        return longestString;
    }

    //Перебрать LinkedList и найти наибольший элемент:
    public int findMaxElement(LinkedList<Integer> list) {
        int max = Integer.MIN_VALUE;
        for (int num : list) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Перебрать LinkedList и найти первое вхождение определенной строки:

    public int findFirstOccurrence(LinkedList<String> list, String target) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(target)) {
                return i;
            }
        }
        return -1;
    }

    //Перебрать LinkedList и заменить все элементы, кратные 3, на нули:
    public void replaceMultiplesOfThree(LinkedList<Integer> list) {
        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            int num = iterator.next();
            if (num % 3 == 0) {
                iterator.set(0);
            }
        }
    }

    //Перебрать LinkedList и удалить все элементы, содержащие определенную подстроку
    public void removeElementsContainingSubstring(LinkedList<String> list, String substring) {
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            if (str.contains(substring)) {
                iterator.remove();
            }
        }
    }

    //Перебрать LinkedList и вычислить произведение всех элементов:

    public int calculateProduct(LinkedList<Integer> list) {
        int product = 1;
        for (int num : list) {
            product *= num;
        }
        return product;
    }

    //Перебрать LinkedList и заменить все гласные буквы в каждой строке на символ '*' :

    public void replaceVowelsWithAsterisk(LinkedList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            str = str.replaceAll("[aeiouAEIOU]", "*");
            list.set(i, str);
        }

    }

    //Перебрать LinkedList и вывести все элементы в обратном порядке:
    public void printReversedLinkedList(LinkedList<?> list) {
        ListIterator<?> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }

    //Перебрать LinkedList и найти самую длинную строку, не содержащую пробелов:
    public String findLongestStringWithoutSpaces(LinkedList<String> list) {
        String longestString = "";
        for (String str : list) {
            if (str.length() > longestString.length() && !str.contains(" ")) {
                longestString = str;
            }
        }
        return longestString;
    }
}
