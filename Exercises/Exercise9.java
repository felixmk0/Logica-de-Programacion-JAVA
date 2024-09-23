package Exercises;

/*
    1. Primero, pide 2 números (N x M), con esos números, crea una matriz vacía (llena de 0).
    2. Crea un algoritmo que genere un marco alrededor con unos (1). Es decir, el perímetro debe estar lleno de "1".
    3. Finalmente, imprime la matriz por pantalla.

    Ejemplo: (Salida por consola)

    Introduce un numero (N):
    10
    Introduce un numero (M):
    20

    11111111111111111111
    10000000000000000001
    10000000000000000001
    10000000000000000001
    10000000000000000001
    10000000000000000001
    10000000000000000001
    10000000000000000001
    10000000000000000001
    11111111111111111111
 */


import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero (N):");
        int n = scanner.nextInt();

        System.out.println("Introduce un numero (M):");
        int m = scanner.nextInt();

        int[][] frame = new int[n][m];

        for (int i = 0; i < frame.length; i++) {
            for (int j = 0; j < frame[i].length; j++) {
                if (i == 0) frame[i][j] = 1;
                else {
                    if (j == frame[i].length - 1 || j == frame[i][1] || i == frame.length - 1) {
                        frame[i][j] = 1;
                    }
                }
            }
        }

        for (int i = 0; i < frame.length; i++) {
            for (int j = 0; j < frame[i].length; j++) {
                System.out.print(frame[i][j]);
            }
            System.out.println();
        }
    }
}
