package by.yakovtsev.introduction.algorithmization_2.matrix;

import java.util.Arrays;

//6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
public class Task6 {
    public static void main(String[] args) {
        squareMatrix( 6 );
    }

    public static void squareMatrix(int size) {
        int[][] matrix = new int[size][size];

        for( int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length - i; j++){
                matrix[i][j] = i + 1;
            }
        }


        System.out.println("Matrix: ");
        for (int i = 0; i < matrix.length; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
