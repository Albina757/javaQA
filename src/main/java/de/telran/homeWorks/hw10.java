package de.telran.homeWorks;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
public class hw10 {

    public static void main(String[] args) {
        // Создаем список и наполняем его 10 миллионами элементов
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10000000; i++) {
            list.add(i);
        }

        // а) Перебор с помощью for-each loop
        long startTime = System.currentTimeMillis();
        for (int i : list) {
            int temp = i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("for-each loop: " + (endTime - startTime) + " ms");

        // b) Классический for, с выполнением условия i<list.size()
        startTime = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            int temp = list.get(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("classic for with list.size(): " + (endTime - startTime) + " ms");

        // b) Классический for, но размер рассчитываем заранее
        int size = list.size();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            int temp = list.get(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("classic for with pre-calculated size: " + (endTime - startTime) + " ms");

        // c) Классический for, проходим список с конца до начала
        startTime = System.currentTimeMillis();
        for (int i = size - 1; i >= 0; i--) {
            int temp = list.get(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("classic for in reverse: " + (endTime - startTime) + " ms");

        // d) Использование Iterator
        startTime = System.currentTimeMillis();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int temp = iterator.next();
        }
        endTime = System.currentTimeMillis();
        System.out.println("Iterator: " + (endTime - startTime) + " ms");

        // e) Использование ListIterator для прямого прохода
        startTime = System.currentTimeMillis();
        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            int temp = listIterator.next();
        }
        endTime = System.currentTimeMillis();
        System.out.println("ListIterator forward: " + (endTime - startTime) + " ms");

        // f) Использование ListIterator для обратного прохода
        startTime = System.currentTimeMillis();
        listIterator = list.listIterator(size);
        while (listIterator.hasPrevious()) {
            int temp = listIterator.previous();
        }
        endTime = System.currentTimeMillis();
        System.out.println("ListIterator backward: " + (endTime - startTime) + " ms");
    }
}


