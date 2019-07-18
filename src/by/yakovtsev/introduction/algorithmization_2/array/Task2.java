package by.yakovtsev.introduction.algorithmization_2.array;

public class Task2 {
    public static void main(String[] args) {
        countReplace(30, 15);
    }
    public static void countReplace(int size, int z){
        double [] numbers = new double[size];
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (Math.random() * 30);
            if (numbers[i] > z) {
                System.out.print(numbers[i] + "; ");
                numbers[i] = z;
                count++;
            }
        }
        System.out.println("\nNumber of replacements == " + count);
    }

}
