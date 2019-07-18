package by.yakovtsev.introduction.algorithmization_2.array_sort;

import java.util.Arrays;

public class Task3 {

    public static void main(String[] args) {
        sortSelection(7);
    }

    public static void sortSelection(int size) {
        int[] firstArray = new int[size];
        int temp;

        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = i;
        }

        System.out.println("Array: " + Arrays.toString(firstArray));

        for (int i = 0; i < firstArray.length / 2; i++){
            temp = firstArray[i];
            firstArray[i] = firstArray[firstArray.length - i - 1];
            firstArray[firstArray.length - i - 1] = temp;
        }

        System.out.println("Array: " + Arrays.toString(firstArray));
    }
}
