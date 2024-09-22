package Exercises;

/*
    Se introducen dos números enteros a través de la consola, se guardan en un array, luego se almacenan todos los números comprendidos entre los dos enteros en ese mismo array y, finalmente, se muestran por consola.

    Ejemplo:
    Introduce un número: 10
    Introduce un número: 20

    [10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]

*/

import java.util.Arrays;
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = 0, lastNum = 0;
        int[] array = new int[2];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce un numero:");
            array[i] = scanner.nextInt();
        }

        int[] sortedArray = Arrays.stream(array).sorted().toArray();

        firstNum = sortedArray[0];
        lastNum = sortedArray[sortedArray.length - 1];

        int[] finalArray = new int[lastNum - firstNum + (+1)];

        for (int i = 0; i < finalArray.length; i++) {
            if (i == 0) {
                finalArray[i] = firstNum;
                firstNum++;
            } else finalArray[i] = firstNum++;
            if (i == finalArray.length - 1) finalArray[i] = lastNum;
        }

        System.out.println(Arrays.toString(finalArray));
    }
}
