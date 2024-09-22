package Exercises;

/*
    Dadas 6 notas que se tienen que almacenar en un array, escribir la cantidad de alumnos aprobados, condicionados (nota = 4) y suspendidos.
    También crear 3 arrays nuevos: un array con las notas de los aprobados, otro con las notas de los condicionados y el último con las notas de los suspendidos, y mostrarlos por consola.
*/

import java.util.Arrays;
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        int aprobados = 0, condicionados = 0, suspensos = 0;
        int[] notas = new int[6]; int[] aprobadosArray = new int[notas.length]; int[] condicionadosArray = new int[notas.length]; int[] suspensosArray = new int[notas.length];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Introduce una nota: ");
            notas[i] = scanner.nextInt();

            if (notas[i] < 0 || notas[i] > 10) {
                System.out.println("La nota tiene que ser entre 0-10");
                return;
            }

            if (notas[i] <= 4) {
                if (notas[i] == 4) {
                    condicionados++;
                    condicionadosArray[i] = notas[i];
                } else {
                    suspensos++;
                    suspensosArray[i] = notas[i];
                }
            } else {
                aprobados++;
                aprobadosArray[i] = notas[i];
            }
        }

        // Eliminar ceros del los arrays, con expresión lambda.
        aprobadosArray = Arrays.stream(aprobadosArray).filter(nota -> nota != 0).toArray();
        condicionadosArray = Arrays.stream(condicionadosArray).filter(nota -> nota != 0).toArray();
        suspensosArray = Arrays.stream(suspensosArray).filter(nota -> nota != 0).toArray();

        System.out.println("Han aprobado " + aprobados + (aprobados == 1 ? " alumno " : " alumnos ") + "con: " + Arrays.toString(aprobadosArray));
        System.out.println("Han quedado condicionados " + condicionados + (condicionados == 1 ? " alumno " : " alumnos ") + "con: " + Arrays.toString(condicionadosArray));
        System.out.println("Han suspendido " + suspensos + (suspensos == 1 ? " alumno " : " alumnos ")+"con: " + Arrays.toString(suspensosArray));

    }
}
