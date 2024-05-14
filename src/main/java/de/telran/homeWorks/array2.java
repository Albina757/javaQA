package de.telran.homeWorks;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//import java.util.Arrays;
//
//
public class array2 {
    public static void main(String[] args) {
//        int[] arr3 = {1, 5, 7, 3, 8, 0};
//        int sum = 0;
//        for (int i = 0; i < arr3.length; i++) {
//            sum = sum + arr3[i];
//        }
//        System.out.println(sum);
//
////        Создайте массив чисел. Замените все отрицательные значения на 0.
//
//        int[] arr4 = {1, -5, 7, -13, 8, 0};
//        for (int i = 0; i < arr4.length; i++) {
//            if (arr4[i] < 0) {
//                arr4[i] = 0;
//            }
//
//        }
//
//        System.out.println(Arrays.toString(arr4));


//        3) Посчитайте произведение положительных элементов одномерного массива.

//        int[] arr5 = {1, -5, 7, -13, 8, 0};
//        int multi = 1;
//        for (int i = 0; i < arr5.length; i++) {
//            if (arr5[i] > 0) {
//                multi = multi * arr5[i];
//            }
//
//        }
//            System.out.println(multi);

//    Создайте массив чисел. Создайте его копию, которая будет содержать только отрицательные значения из первого массива.

//        int[] arr5 = {1, -5, 7, -13, 8, 0};
//
//        List<Integer> negativeNumbers = new ArrayList<>();
//        for (int num : arr5) {
//            if (num < 0) {
//                negativeNumbers.add(num);
//            }
//        }
//        int[] negativeArray = new int[negativeNumbers.size()];
//        for (int i = 0; i < negativeNumbers.size(); i++) {
//            negativeArray[i] = negativeNumbers.get(i);
//        }
//
//        System.out.println(Arrays.toString(negativeArray));
//    }


//5)Создайте 2-х мерный массив. Посчитайте сумму всех парных элементов массива.
//
//        int[][] array7 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        int sum = 0;
//        for (int i = 0; i < array7.length; i++) {
//            for (int j = 0; j < array7[i].length; j++) {
//                if ((i + j) % 2 == 0) {
//                    sum = sum + array7[i][j];
//                }
//            }
//        }
//        System.out.println(sum);

//6) Реализуйте метод, который ищет значение в 2-х мерном массиве и возвращает индекс в виде [x][y].

        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] result = findValue(array, 5);
        System.out.println("Индекс элемента с заданным значением: [" + result[0] + "][" + result[1] + "]");
    }

        public static int[] findValue ( int[][] array, int value){
            int[] index = new int[2];
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j] == value) {
                        index[0] = i;
                        index[1] = j;
                        return index;
                    }
                }
            }
            return index;
        }
    }


   // 7. Поменяйте местами значения первой строки 2-х мерного массива со значениями последней строки.


////8. Создайте 2-х мерный массив. Осортируйте каждый из его подмассивов(строк) в порядке возрастания по отдельности.
////public class Main {
////    public static void main(String[] args) {
//        int[][] array = {{3, 2, 1}, {6, 5, 4}, {9, 8, 7}};
//        for (int i = 0; i < array.length; i++) {
//            Arrays.sort(array[i]);
//        }
//        System.out.println("Массив после сортировки каждой строки: " + Arrays.deepToString(array));
//    }
//}



