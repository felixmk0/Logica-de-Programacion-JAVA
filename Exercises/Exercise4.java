package Exercises;

/*
    De un array lleno con 10 numeros, almacenar en otra array, solo numeros comprendidos entre 1 y 50.
    Ejemplo:
    int[] array = [40, 34, 80, 60, 90, 99, 51, 22, 11, 67, 101];
    int[] cleanedArray: [80, 60, 90, 99, 51]
*/

import java.util.Arrays;

public class Exercise4 {
    public static void main(String[] args) {
        int[] array = {40, 34, 80, 60, 90, 99, 51, 22, 11, 101};
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) if (array[i] >= 50 & array[i] <= 100) newArray[i] = array[i];
        int[] cleanedArray = Arrays.stream(newArray).filter(num -> num != 0).toArray();

        System.out.println(Arrays.toString(cleanedArray));
    }
}
