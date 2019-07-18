package by.yakovtsev.introduction.algorithmization_2.matrix;

import java.util.Arrays;

public class Task7 {

    public static void main(String[] args) {
        squareMatrix(6);
    }

    public static void squareMatrix(int size) {
        double[][] matrix = new double[size][size];
        int countPositiv = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2) / matrix.length));
                if (matrix[i][j] > 0) {
                    countPositiv++;
                }
            }
        }

        System.out.println("Matrix: ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println("countPositiv: " + countPositiv);
    }
}
