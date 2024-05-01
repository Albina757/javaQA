package de.telran.lesson_5;
import java.util.Arrays;
public class simpleMultiArrays {
    public static void main(String[] args) {
        int[][] arrInt;
        arrInt = new int[2][3];
        System.out.println(Arrays.toString(arrInt));
        System.out.println(Arrays.deepToString(arrInt));

        arrInt[0][1] = 5; //присвоение
        arrInt[1][2] = 10; //присвоение
        System.out.println(Arrays.deepToString(arrInt));

        int[][][] arrInt3D = {{{1,2}, {6,7}},{{3,4},{5,6}}};
        System.out.println(Arrays.deepToString(arrInt3D));
        arrInt3D[0][1][1] = 10;// изменение
        arrInt3D[1][1][0] = 22;// изменение
        System.out.println(Arrays.deepToString(arrInt3D));
        System.out.println(arrInt3D[0][1][0]);// получения

    }
}
