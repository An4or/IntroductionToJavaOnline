package by.yakovtsev.introduction.algorithmization_2.decomposition;

import java.util.Arrays;

//5. Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
//которое меньше максимального элемента массива, но больше всех других элементов).
public class Task5 {
    public static void main(String[] args) {
        serchPreMaxNum(20);
    }

    public static void serchPreMaxNum(int size) {
        int[] arr = ramdomFillArr(size);
        System.out.println("Array " + Arrays.toString(arr));
        Arrays.sort(arr);
        for (int i = arr.length-1; i > 0; i--) {
            if (arr[i -1] < arr[i]){
                System.out.println("PreMaxNumber == " + arr[i -1]);
                break;
            }
        }
    }

    public static int[] ramdomFillArr(int size) {
        int[] arrays = new int[size];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = (int) (Math.random() * 25 - 10);
        }
        return arrays;
    }

}
