package by.yakovtsev.introduction.algorithmization_2.array;

import java.util.Arrays;

//10. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
//элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
public class Task10 {

    public static void main(String[] args) {
        compressArray(20);
    }

    public static void compressArray(int size) {
        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        int j = 1;

        for (int i = 2; i < numbers.length; i += 2) {
             numbers[j] = numbers[i];
            j++;
        }

        for (int i = numbers.length/2; i < numbers.length; i ++) {
            numbers[i] = 0;
        }

        System.out.println("Every second element is replaced by zero: " + Arrays.toString(numbers));
    }
}
