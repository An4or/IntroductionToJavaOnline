package by.yakovtsev.introduction.algorithmization_2.matrix;

import by.yakovtsev.introduction.ConsoleHelper;

import java.util.Arrays;

//9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
//столбец содержит максимальную сумму
public class Task9 {

    public static void main(String[] args) {
        matrix(6, 7);
    }

    public static void matrix(int sizeN, int sizeM) {
        int[][] matrix = new int[sizeN][sizeM];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 15);
            }
        }

        ConsoleHelper.printMatrix(matrix);
        int[] colSumm = new int[sizeM];

        for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                colSumm[j] += matrix[i][j];
            }
        }

        int maxSumm = 0;
        int maxColIndex = 0;

        for(int i = 0; i < colSumm.length; i++){
            if (colSumm[i] > maxSumm){
                maxSumm = colSumm[i];
                maxColIndex = i;
            }
        }

        System.out.println("Columns with amount: " + Arrays.toString(colSumm));
        System.out.println("The highest amount in the index: " + maxColIndex);


    }
}
