package by.yakovtsev.introduction.algorithmization_2.matrix;

import java.util.Arrays;

//2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
public class Task2 {

    public static void main(String[] args) {
        outElemDiagonal(5, 5);
    }

    public static void outElemDiagonal(int sizeN, int sizeM) {
        int[][] matrix = new int[sizeN][sizeM];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 30);
            }
        }

        for (int i = 0; i < matrix.length; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }

        for (int i = 0; i < matrix.length; i ++) {
            System.out.print(matrix[i][i] + ", ");
        }

    }
}

