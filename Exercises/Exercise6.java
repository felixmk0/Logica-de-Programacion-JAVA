package Exercises;

/*
    Dibuja un cuadrado con relleno (*), que nos pida su tamaño por entrada a través de la clase Scanner de java.util
*/

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el número de elementos (*) del cuadrado:");
        int e = scanner.nextInt();

        for (int f = 1; f <= e; f++) {
            for (int c = 1; c <= e; c++) System.out.print("*");
            System.out.println();
        }
    }
}