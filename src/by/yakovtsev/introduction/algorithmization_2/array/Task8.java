package by.yakovtsev.introduction.algorithmization_2.array;

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        removeMin(20);
    }

    public static void removeMin(int size) {
        int[] numbers = new int[size];
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 10);
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        int count = 0;
        for (int i = 0; i < numbers.length; i++){
            if(numbers[i] == min){
                count++;
            }
        }

        int[] newArray = new int[size-count];

        int j = 0;
        for(int i = 0; i < numbers.length; i++){
            if (numbers[i] != min){
                newArray[j] = numbers[i];
                j++;

            }

        }
        System.out.println("Old array: " + Arrays.toString(numbers)+ " oldArray.length == " + numbers.length);
        System.out.println("New array: " + Arrays.toString(newArray) + " newArray.length == " + newArray.length);
    }
}
