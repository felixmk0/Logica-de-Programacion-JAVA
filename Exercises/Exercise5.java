package Exercises;

/*
    Llenar un array de 8 posiciones: la mitad de ceros y la mitad de unos (4 ceros y 4 unos)
*/

import java.util.Arrays;

public class Exercise5 {
    public static void main(String[] args) {
        int[] array = new int[8];
        for (int i = 0; i < array.length; i++) {
            if (i < 4) array[i] = 0;
            else array[i] = 1;
        }
        System.out.println(Arrays.toString(array));
    }
}
