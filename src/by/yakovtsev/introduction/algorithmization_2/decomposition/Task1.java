package by.yakovtsev.introduction.algorithmization_2.decomposition;

public class Task1 {
    public static void main(String[] args) {

        System.out.println("Greatest Common Divisor: " + gcd(6, 12));
        System.out.println("Least Common Multiple: " + lcm(3, 4));
    }

    public static long gcd(long a, long b){
        return b == 0 ? a : gcd(b,a % b);
    }

    public static long lcm(long a, long b){
        return a * b / gcd(a, b);
    }
}
