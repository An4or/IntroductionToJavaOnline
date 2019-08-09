package by.yakovtsev.introduction.algorithmization_2.matrix;

import java.util.Arrays;

//4. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
public class Task4 {

    public static void main(String[] args) {
        squareMatrix( 6 );
    }

    public static void squareMatrix(int size) {
        int[][] matrix = new int[size][size];

//        for (int i = 0; i < matrix.length; i++){
//            if( i % 2 == 0) {
//                for (int j = 0; j < matrix[i].length; j++) {
//                    matrix[i][j] = j+1;
//                }
//            }else{
//                for (int j = 0; j < matrix[i].length; j++ ){
//                    matrix[i][j] = matrix[j].length - j;
//                }
//            }
//        }

        for (int i = 0; i < matrix.length; i++){
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = ( i % 2 == 0) ?  j+1 : matrix[j].length - j;
                }
            }


        System.out.println("Matrix: ");
        for (int i = 0; i < matrix.length; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

}
