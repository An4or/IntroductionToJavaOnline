package by.yakovtsev.introduction.algorithmization_2.decomposition;

public class Task2 {

    public static void main(String[] args) {

        System.out.println("Greatest Common Divisor: " + gcd(10, 12, 16, 24));
    }

    public static long gcd(long a, long b){
        return b == 0 ? a : gcd(b,a % b);
    }

    public static long gcd(long a, long b, long c, long d){
        return gcd(Math.min(a,b), Math.min(c,d));
    }
}
