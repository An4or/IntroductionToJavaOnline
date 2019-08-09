package by.yakovtsev.introduction.algorithmization_2.decomposition;

//13. Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
//Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для
//решения задачи использовать декомпозицию.
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