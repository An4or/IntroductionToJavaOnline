package by.yakovtsev.introduction.algorithmization_2.array_sort;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        sortShelk(20);
    }

    public static void sortShelk(int size) {
        int[] array = new int[size];

        System.out.print("Array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 30);
            System.out.print(array[i] + "; ");
        }

        for (int i = 0; i < array.length - 1; i++) {
            int change;
            if (array[i] > array[i + 1]) {
                change = array[i];
                array[i] = array[i + 1];
                array[i + 1] = change;
                if (i > 0) {
                    i -= 2;
                }
            }
        }
        System.out.println("\nResult" + Arrays.toString(array));

    }
}