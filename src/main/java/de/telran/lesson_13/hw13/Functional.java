package de.telran.lesson_13.hw13;

import java.util.function.Function;

public class Functional {
    // Написать лямбда выражение, которое принимает на вход число и возвращает значение “Положительное число”,
    //    “Отрицательное число” или  “Ноль”. Используем функциональный интерфейс Function.
    public static void main(String[] args) {
        Function<Integer,String> function= i->{
          String result = "Zero";
          if (i>0){
              result = "Positive number";
          } else if (i <0){
              result = "Negative number";
          }
          return result;
        };
        System.out.println(function.apply(-67));
        System.out.println(function.apply(67));
        System.out.println(function.apply(0));
    }
}
