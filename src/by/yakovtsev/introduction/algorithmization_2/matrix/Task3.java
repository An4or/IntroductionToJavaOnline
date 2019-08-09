package by.yakovtsev.introduction.algorithmization_2.matrix;

import java.util.Arrays;

//3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
public class Task3 {

    public static void main(String[] args) {
        outElemColRow(5, 5, 3, 2);
    }

    public static void outElemColRow(int sizeN, int sizeM, int colNum, int rowNum) {
        int[][] matrix = new int[sizeN][sizeM];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 30);
            }
        }

        for (int i = 0; i < matrix.length; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }

        System.out.println("\nColumn №" + colNum + ": ");
        for (int i = 0; i < matrix.length; i++){
            System.out.print(matrix[i][colNum] + ", ");
        }

        System.out.println("\n\nRow №" + rowNum + ": ");
        for(int i = 0; i < matrix[rowNum].length; i++){
            System.out.print(matrix[rowNum][i] + ", ");
        }
    }
}
