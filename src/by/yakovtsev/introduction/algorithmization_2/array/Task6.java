package by.yakovtsev.introduction.algorithmization_2.array;

public class Task6 {
    public static void main(String[] args) {
        summNumbers(10);
    }

    public static void summNumbers(int size) {
        double[] numbers = new double[size];
        double summ = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (Math.random() * 30);
            if (isSimple(i)) {
                summ += numbers[i];
            }
        }

        System.out.println("\nSumma == " + summ);
    }

    public static boolean isSimple(int d) {
        if (d == 0) {
            return false;
        }
        int sqrtInt = (int) Math.sqrt(d) + 1;
        for (int i = 2; i <= sqrtInt; i++){
            if ((d % i) == 0){
                return false;
            }
        }
        return true;
    }
}
