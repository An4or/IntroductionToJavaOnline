package by.yakovtsev.introduction.algorithmization_2.matrix;

import by.yakovtsev.introduction.ConsoleHelper;

import java.util.Arrays;

public class Task8 {

    public static void main(String[] args) {
        squareMatrix( 6 , 7);
    }

    public static void squareMatrix(int sizeN, int sizeM) {
        int[][] matrix = new int[sizeN][sizeM];

        for( int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = (int) (Math.random()*15);
            }
        }

        ConsoleHelper.printMatrix(matrix);

        int colChange = ConsoleHelper.readInt();
        int onColChange = ConsoleHelper.readInt();
        int temp = 0;

        for (int i = 0; i < matrix.length; i++){
            temp = matrix[i][colChange];
            matrix[i][colChange] = matrix[i][onColChange];
            matrix[i][onColChange] = temp;
        }

        ConsoleHelper.printMatrix(matrix);

    }
}
