package Exercises;

/*
    Crea un algoritmo, que con una matriz de 15x15, inserte justo en el medio de la matriz un "1".
*/

public class Exercise10 {
    public static void main(String[] args) {
        int[][] matrix = new int[15][15];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == matrix.length / 2 && j == matrix.length / 2) matrix[i][j] = 1;
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
