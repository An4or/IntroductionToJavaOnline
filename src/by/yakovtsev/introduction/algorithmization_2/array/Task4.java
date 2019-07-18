package by.yakovtsev.introduction.algorithmization_2.array;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        changeValue(10);
    }
    public static void changeValue(int size){
        double [] numbers = new double[size];
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        int minCount = 0;
        int maxCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (Math.random() * 30);
            if (numbers[i] > i) {
                max = numbers[i];
                maxCount = i;
            }
            if(numbers[i]< min){
                min = numbers[i];
                minCount = i;
            }
        }
        System.out.println("Original array: " + Arrays.toString(numbers));
        numbers[maxCount] = min;
        numbers[minCount] = max;
        System.out.println("After change: " + Arrays.toString(numbers));
    }
}
