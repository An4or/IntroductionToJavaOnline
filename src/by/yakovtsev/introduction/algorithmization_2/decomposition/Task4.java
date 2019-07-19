package by.yakovtsev.introduction.algorithmization_2.decomposition;

import java.util.Arrays;

public class Task4 {

    public static void main(String[] args){

        int [][] points = ramdomFillPoints(8);

        for (int i = 0; i < points.length; i++) {
            System.out.println(Arrays.toString(points[i]));
        }

        int [] betweenPoints = maxLength(points);

        System.out.println("Max distance between points: " + Arrays.toString(betweenPoints));
    }

    public static int [][] ramdomFillPoints(int countPoint){
        int [][] arrays = new int[countPoint][2];
        for (int i = 0; i < arrays.length; i++){
            for (int j = 0; j < arrays[i].length; j++){
                arrays[i][j] = (int)(Math.random()*25 - 10);
            }
        }
        return arrays;
    }

    public static int[] maxLength(int [][] arrayDots){
        double maxLength = 0;
        double length = 0;
        int[] betweenDots = new int[2];

        for(int i = 0; i < arrayDots.length; i++){
            for (int j = 1; j < arrayDots.length; j++){
                length = getDistance(arrayDots[i][0], arrayDots[i][1], arrayDots[j][0], arrayDots[j][1]);
                if (length > maxLength){
                    maxLength = length;
                    betweenDots[0] = i + 1;
                    betweenDots[1] = j + 1;
                }
            }
        }
        return betweenDots;
    }

    public static double getDistance(int x1, int y1, int x2, int y2)
    {
        double a = ((x2-x1)*(x2-x1))  +  ((y2-y1)*(y2-y1)) ;
        return Math.sqrt( a );

    }

}

