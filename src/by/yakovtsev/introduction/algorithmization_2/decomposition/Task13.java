package by.yakovtsev.introduction.algorithmization_2.decomposition;

public class Task13 {
    public static void main(String[] args) {
        twinsFind(100);
    }

    public static boolean checkSimple(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException();
        }
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void twinsFind(int start) {
        for (int i = start; i <= start * 2; i++) {
            if (checkSimple(i) && checkSimple(i + 2)) {
                System.out.println(i + " " + (i + 2));
            }
        }
    }
}