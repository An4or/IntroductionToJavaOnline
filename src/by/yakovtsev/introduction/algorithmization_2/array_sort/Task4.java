package by.yakovtsev.introduction.algorithmization_2.array_sort;

import java.util.Arrays;

public class Task4 {

    public static void main(String[] args) {
        sortExchange(7);
    }

    public static void sortExchange(int size) {
        int[] array = new int[size];
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        System.out.println("Array: " + Arrays.toString(array));

        do {
            int temp;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    count++;
                }
            }
        } while (sortСheck(array));

        System.out.println("Array: " + Arrays.toString(array) + " changes: " + count);
    }

    private static boolean sortСheck(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                return false;
            } else {
                break;
            }
        }
        return true;
    }

}