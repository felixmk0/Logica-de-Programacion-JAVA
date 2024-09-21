package Exercises;

/*
    Mostrar en pantala la tabla del numero introducido por consola.
    Ejemplo: 4*5=20, 4*6=24, 4*7=28, 4*8=32, 4*9=36, 4*10=40
*/

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Intoduce el numero de la tabla de multiplicar:");
        int numTabla = scanner.nextInt();
        if (numTabla <= 0) {
            System.out.println("ERROR: Debes introducir un numero mayor que 0!!");
            return;
        }

        System.out.println("Introduce hasta que numero quieres que sea multiplice el nr. introducido: ");
        int cantidadNum = scanner.nextInt();
        if (cantidadNum <= 0) {
            System.out.println("ERROR: Debes introducir un numero mayor que 0!!");
            return;
        }

        for (int i = numTabla; i == numTabla; i++) {
            for (int j = 0; j <= cantidadNum; j++) {
                System.out.println(i + "*" + j + "=" + i * j);
            }
        }
    }
}