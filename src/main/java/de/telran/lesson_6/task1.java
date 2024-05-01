package de.telran.lesson_6;

import java.util.List;
import java.util.ArrayList;

public class task1 {
    public static void main(String[] args) {
//        Возьмите список, удалите все элементы, которые не соответствуют определенным критериям.
//        вам дан список значений
//        у вас есть критерии для этих значений
//        вернуть список только с теми значениями из исходного списка, которые соответствуют этим критериям

        List<human> list = new ArrayList<>();

        human human1 = new human("John", 45);
        list.add(human1);

        list.add(new human("Jeremy", 55));
        list.add(new human("Susan", 43));

        System.out.println(list);

        List<human> list2 = List.of(
                new human("Jessica", 55),
                new human("Jason", 38));

        System.out.println(list2);

        list.addAll(list2);
        System.out.println(list);

        int i = 0;
        while (i < list.size()) {
            if (list.get(i).getAge() > 30) {
                list.remove(i);
            } else {
                i++;
            }
        }
        System.out.println(list);


    }


}


