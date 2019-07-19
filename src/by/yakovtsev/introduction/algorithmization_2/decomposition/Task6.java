package by.yakovtsev.introduction.algorithmization_2.decomposition;

public class Task6 {

    public static void main(String[] args) {
        if (checkSimple(2, 13, 37)){
            System.out.println("These numbers are simple");
        }else {
            System.out.println("These numbers are not simple");
        }

    }

    public static boolean checkSimple(int one, int two, int three){
        return checkSimple(one) && checkSimple(two) & checkSimple(three);

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
}
