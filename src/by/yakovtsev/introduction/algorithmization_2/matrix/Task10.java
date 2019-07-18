package by.yakovtsev.introduction.algorithmization_2.matrix;

import by.yakovtsev.introduction.ConsoleHelper;

import java.util.Arrays;

public class Task10 {

    public static void main(String[] args) {
        squareMatrix( 6 );
    }

    public static void squareMatrix(int size) {
        int[][] matrix = new int[size][size];

        for (int i = 0; i < matrix.length; i++ ){
            for (int j = 0; j < matrix[i].length; j++ ){
                matrix[i][j] = (int) (Math.random()*15 - 5);
            }
        }

        ConsoleHelper.printMatrix(matrix);

        System.out.print("Positiv on diagonal: ");
        for (int i = 0, j = 0; i < matrix.length; i++, j++) {
            if (matrix[i][j] > 0) {
                System.out.print(matrix[i][j] + ", ");
            }
        }
    }
}
