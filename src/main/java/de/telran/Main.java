package de.telran;

import de.telran.lesson_13.hw13.Printable;

public class Main {
        public static void main(String[] args) {
            Printable printUpperCase = text -> System.out.println(text.toUpperCase());
            Printable printLowerCase = text -> System.out.println(text.toLowerCase());

            printUpperCase.print("Hello, World!"); // Выведет "HELLO, WORLD!"
            printLowerCase.print("Hello, World!"); // Выведет "hello, world!"
        }



}
