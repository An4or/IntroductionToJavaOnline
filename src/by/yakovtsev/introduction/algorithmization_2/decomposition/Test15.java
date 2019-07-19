package by.yakovtsev.introduction.algorithmization_2.decomposition;

public class Test15 {
    public static void main(String[] arga) {

        increasingSequence(4);

    }

    public static void increasingSequence(int order) {
        if (order > 1 && order <= 9) {
            int[] array = new int[order];
            int j = 1;
            do {
                for (int i = 0; i < array.length; i++) {
                    array[i] = j + i;
                }
                int growthNumber = 0;
                for (int i = 0; i < array.length; i++) {
                    growthNumber += array[i];
                    if (i == array.length - 1) {
                        continue;
                    }
                    growthNumber *= 10;
                }
                System.out.println(growthNumber);
                j++;
            } while (array[array.length - 1] < 9);
        } else {
            System.out.println("Uncorrect value: " + order);
        }
    }
}