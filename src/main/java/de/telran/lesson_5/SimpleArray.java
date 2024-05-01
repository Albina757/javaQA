package de.telran.lesson_5;

import java.util.Arrays;

public class SimpleArray {
    public static void main(String[] args) {
     int[] arrInt;
     arrInt = new int [10];
        System.out.println(Arrays.toString(arrInt));
        arrInt[0] = 5;
        arrInt[5] = 10;
        System.out.println(Arrays.toString(arrInt));

        int [] arrIntLit = {1,5,7,3,8,0};
        System.out.println(Arrays.toString(arrIntLit));

        int a = arrIntLit[5];
        System.out.println(arrIntLit[2]);


        //копирование массива
        int[] arrIntLitCopy = arrIntLit; // копирование ссылки
        arrIntLitCopy[2] = 11;
        System.out.println(Arrays.toString(arrIntLitCopy));
        System.out.println(Arrays.toString(arrIntLit));

        int[] arrIntLitClone = arrIntLit.clone(); //клонирование объекта
        arrIntLitClone[2] = 33;
        System.out.println(Arrays.toString(arrIntLitClone));
        System.out.println(Arrays.toString(arrIntLit));
    }


}
