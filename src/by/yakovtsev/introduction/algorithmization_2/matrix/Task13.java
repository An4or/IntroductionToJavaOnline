package by.yakovtsev.introduction.algorithmization_2.matrix;

import by.yakovtsev.introduction.ConsoleHelper;

//13. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
public class Task13 {

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

        boolean isSort = false;
        while(isSort == false){
            int forSort;
            for (int i = 1; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if(matrix[i][j] < matrix[i-1][j]){
                        forSort = matrix[i][j];
                        matrix[i][j] = matrix[i-1][j];
                        matrix[i-1][j] = forSort;
                    }
                }
            }
            for(int i = 1; i < matrix.length; i++){
                for (int j = 0; j < matrix[i].length; j ++){
                    if(matrix[i][j] >= matrix[i - 1][j]){
                        isSort = true;
                    }else{
                        isSort = false;
                        break;
                    }
                }
                if(isSort == false){
                    break;
                }
            }
        }

        ConsoleHelper.writeMessage("Ascending sort");
        ConsoleHelper.printMatrix(matrix);

        do {
            int forSort;
            for (int i = 1; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] > matrix[i - 1][j]) {
                        forSort = matrix[i][j];
                        matrix[i][j] = matrix[i -1][j];
                        matrix[i - 1][j] = forSort;
                    }
                }
            }
            for (int i = 1; i < matrix.length; i++){
                for (int j = 0; j < matrix[i].length; j++){
                    if(matrix[i][j] <= matrix[i - 1] [j]){
                        isSort = true;
                    }else{
                        isSort = false;
                        break;
                    }
                }
                if (isSort == false){
                    break;
                }
            }
        }while(isSort == false);

        ConsoleHelper.writeMessage("Sorting in descending order");
        ConsoleHelper.printMatrix(matrix);

    }
}
