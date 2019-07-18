package by.yakovtsev.introduction.algorithmization_2.array;

import java.util.Arrays;

public class Task9 {

    public static void main(String[] args) {
        searchNumber(20);
    }

    public static void searchNumber(int size) {
        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 5);
        }

        Arrays.sort(numbers);
        int maxRepeat = 0;
        int minNumber = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            int count = 0;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;

                    if (count > maxRepeat) {
                        maxRepeat = count;
                        minNumber = numbers[i];
                    }
                }
            }
        }

        System.out.println("Old array: " + Arrays.toString(numbers));
        System.out.println("Max repeat: " + maxRepeat + " this number == " + minNumber);
    }
}
