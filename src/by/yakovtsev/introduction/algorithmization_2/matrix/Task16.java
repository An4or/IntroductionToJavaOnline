package by.yakovtsev.introduction.algorithmization_2.matrix;

import by.yakovtsev.introduction.ConsoleHelper;

public class Task16 {

    public static void main(String[] args) {
        matrix(3);
    }

    public static void matrix(int size) {
        int[][] matrix = new int[size][size];
        int magVal = (int) ((size * (Math.pow(size, 2) + 1)) / 2);
        int maxVal = (int) Math.pow(size, 2);

        for (int i = 1, j = 0, k = matrix.length / 2; i <= maxVal; i++, j--, k++) {
            if (j >= 0 && k < matrix.length) {
                if (matrix[j][k] == 0) {
                    matrix[j][k] = i;
                } else {
                    j += 2;
                    k--;
                    matrix[j][k] = i;
                }
            } else if (j < 0 && k < matrix.length) {
                j = matrix.length - 1;
                if (matrix[j][k] == 0) {
                    matrix[j][k] = i;
                }
            } else if (j < 0 && k >= matrix.length) {
                j += 2;
                k--;
                matrix[j][k] = i;
            } else if (k >= matrix.length && j >= 0) {
                k = 0;
                if (matrix[j][k] == 0) {
                    matrix[j][k] = i;
                } else {
                    j += 2;
                    k--;
                    matrix[j][k] = i;
                }
            } else {
                ConsoleHelper.writeMessage("no place for the item j = " + j + " k = " + k);
            }
        }
        ConsoleHelper.printMatrix(matrix);
    }
}
