package by.yakovtsev.introduction.algorithmization_2.array_sort;


import java.util.Arrays;

//1. Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
//один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
//дополнительный массив.
public class Task1 {
    public static void main(String[] args) {
        mergArr(8, 7, 4);
    }

    public static void mergArr(int size1, int size2, int k) {
        int[] firstArray = new int[size1];
        int[] secondArray = new int[size2];

        System.out.print("First array: ");
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = (int) (Math.random() * 10);
            System.out.print(firstArray[i] + "; ");
        }

        System.out.print("\nSecond array: ");
        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = (int) (Math.random() * 10 - 21);
            System.out.print(secondArray[i] + "; ");
        }

        int[] combinedArray = concat(firstArray, secondArray, k);
        System.out.println("\nResult" + Arrays.toString(combinedArray));
    }

    private static int[] concat(int[] A, int[] B, int k) {
        int aLen = A.length;
        int bLen = B.length;
        int[] C = new int[aLen + bLen];
        System.arraycopy(A, 0, C, 0, k);
        System.arraycopy(B, 0, C, k, bLen);
        System.arraycopy(A, k, C, k + bLen, aLen - k);
        return C;
    }
}
