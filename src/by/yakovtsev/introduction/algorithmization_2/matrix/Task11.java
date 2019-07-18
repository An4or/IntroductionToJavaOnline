package by.yakovtsev.introduction.algorithmization_2.matrix;

import by.yakovtsev.introduction.ConsoleHelper;

import java.util.Arrays;

public class Task11 {

    public static void main(String[] args) {
        matrix();
    }

    public static void matrix() {
        int sizeN = 10;
        int sizeM = 20;
        int[][] matrix = new int[sizeN][sizeM];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 16);
            }
        }

        ConsoleHelper.printMatrix(matrix);

        System.out.print("Row numbers where  number 5 meat 3 or more times: ");

        for (int i = 0; i < matrix.length; i++){
            int countFive = 0;
            for (int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == 5){
                    countFive++;
                }
            }
            if(countFive >= 3){
                System.out.print(i + ", ");
            }
        }

    }
}
