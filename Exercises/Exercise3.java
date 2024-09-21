package Exercises;

/*
    Mostrar los numeros del 100 al 0, decrementandose de 4 en 4.
*/

public class Exercise3 {
    public static void main(String[] args) {
        for (int i = 100; i >= 0; i -= 4) {
            System.out.println(i);
        }
    }
}