package by.yakovtsev.introduction.algorithmization_2.matrix;

import by.yakovtsev.introduction.ConsoleHelper;

import java.util.Arrays;

public class Task15 {

    public static void main(String[] args) {
        matrix(6, 7);
    }

    public static void matrix(int sizeN, int sizeM) {
        int[][] matrix = new int[sizeN][sizeM];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 50);
            }
        }

        ConsoleHelper.printMatrix(matrix);

        int maxVal = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] > maxVal){
                    maxVal = matrix[i][j];
                }
            }
        }

        ConsoleHelper.writeMessage("Max value == " + maxVal);

        for (int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] % 2 != 0){
                    matrix[i][j] = maxVal;
                }
            }
        }

        ConsoleHelper.writeMessage("Matrix after replacement:");
        ConsoleHelper.printMatrix(matrix);

    }
}
