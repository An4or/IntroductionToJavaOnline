package by.yakovtsev.introduction.algorithmization_2.array;

public class Task1 {
    public static void main(String[] args) {
        findValues(29, 3);
    }

    public static void findValues(int size, int k) {
        int[] numbers = new int[size];
        int summ = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 30);
            if (numbers[i] % k == 0) {
                summ += numbers[i];
                System.out.print(numbers[i] + "; ");
            }
        }
        System.out.println("\nThe sum of multiples " + k + " == " + summ);
    }
}
