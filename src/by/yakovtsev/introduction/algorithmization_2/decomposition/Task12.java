package by.yakovtsev.introduction.algorithmization_2.decomposition;

import java.util.Arrays;

public class Task12 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayFillSumm(15, 12, 800)));
    }

    public static int [] arrayFillSumm(int size, int summNum, int maxVal){
        int [] array = new int[size];

        for (int i = 0; i < array.length; i++){
            int cheakSumm = 0;
            array[i] = (int) (Math.random()*maxVal);
            int cheakNum = array[i];
            do{
                cheakSumm += cheakNum % 10;
                cheakNum /= 10;
            }while(cheakNum > 0);
            if(cheakSumm != summNum){
                i--;
            }
        }

       return array;
    }
}
