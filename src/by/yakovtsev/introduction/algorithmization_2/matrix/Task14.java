package by.yakovtsev.introduction.algorithmization_2.matrix;

import by.yakovtsev.introduction.ConsoleHelper;


public class Task14 {

    public static void main(String[] args) {
        matrix(7, 6);
    }

    public static void matrix(int sizeN, int sizeM) {
        int[][] matrix = new int[sizeN][sizeM];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[i].length; j++) {
                matrix[i][j] = 1;
            }
        }

        ConsoleHelper.printMatrix(matrix);
    }
}
