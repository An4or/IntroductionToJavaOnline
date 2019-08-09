package by.yakovtsev.introduction.algorithmization_2.array_sort;

import java.util.Arrays;

//3. Сортировка выбором. Дана последовательность чисел a1  a2  an .Требуется переставить элементы так,
//чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
//элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
//повторяется. Написать алгоритм сортировки выбором.
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
