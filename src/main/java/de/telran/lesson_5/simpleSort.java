package de.telran.lesson_5;
import java.util.Arrays;

public class simpleSort {
    public static void main(String[] args) {
       int [] arrIntLit = {1,5,3,7,9,5,0};
        System.out.println(Arrays.toString(arrIntLit));

        Arrays.sort(arrIntLit);

        System.out.println(Arrays.toString(arrIntLit));

    }
}
