package by.yakovtsev.introduction.algorithmization_2.array_sort;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        sequenceNumbers(7);
    }

    public static void sequenceNumbers(int size) {
        int[] firstArray = new int[size];
        int[] secondArray = new int[size];

        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = i;
            secondArray[i] = i + 4;
        }

        System.out.println("First array: "+ Arrays.toString(firstArray));
        System.out.println("Second array: "+ Arrays.toString(secondArray));


        int[] combinedArray = concat(firstArray, secondArray);
        Arrays.sort(combinedArray);
        System.out.println("\nResult" + Arrays.toString(combinedArray));
    }

    private static int[] concat(int[] A, int[] B) {
        int aLen = A.length;
        int bLen = B.length;
        int[] C = new int[aLen + bLen];
        System.arraycopy(A, 0, C, 0, aLen);
        System.arraycopy(B, 0, C, aLen, bLen);

        return C;
    }
}
