package Exercises;

/*
    Crear el siguiente algoritmo:

    1. Inscribir un cuadrado dentro de la matriz lleno de "1".
    2. Implementar que el usuario, pueda introducir el tamaño de la matriz cuadrada.

*/

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un tamaño:");
        int size = scanner.nextInt();

        int[][] matrix = new int[size][size];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i >= matrix.length / 3 && j >= matrix.length / 3 && j < matrix.length - matrix.length / 3 && i < matrix.length - matrix.length / 3) {
                    matrix[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
