package by.yakovtsev.introduction.algorithmization_2.array;

//5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
public class Task5 {
    public static void main(String[] args) {
        writeNumbers(20);
    }

    public static void writeNumbers(int size) {
        int[] numbers = new int[size];

        System.out.print("This number > i:  ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 30);
            if (numbers[i] > i) {
                System.out.print(numbers[i] + "; ");
            }
        }

    }
}
