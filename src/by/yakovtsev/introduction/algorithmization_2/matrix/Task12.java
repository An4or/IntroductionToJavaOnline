package by.yakovtsev.introduction.algorithmization_2.matrix;

import by.yakovtsev.introduction.ConsoleHelper;

import java.util.Arrays;

//12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
public class Task12 {

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


        for (int i = 0; i < matrix.length; i++) {
            Arrays.sort(matrix[i]);
        }

        ConsoleHelper.writeMessage("Ascending sort");
        ConsoleHelper.printMatrix(matrix);

        for(int i = 0; i < matrix.length; i++) {
            int forSort;
            boolean checkSort = false;
            while (checkSort == false) {
                for (int j = 1; j < matrix[i].length; j++) {
                    if (matrix[i][j] > matrix[i][j - 1]) {
                        forSort = matrix[i][j];
                        matrix[i][j] = matrix[i][j - 1];
                        matrix[i][j - 1] = forSort;
                    }
                }
                for (int j = 1; j < matrix[i].length; j++) {
                    if (matrix[i][j] <= matrix[i][j - 1]) {
                        checkSort = true;
                    } else {
                        checkSort = false;
                        break;
                    }
                }
            }
        }

        ConsoleHelper.writeMessage("Sorting in descending order");
        ConsoleHelper.printMatrix(matrix);

    }
}
