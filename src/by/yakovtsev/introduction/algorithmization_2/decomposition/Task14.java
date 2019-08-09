package by.yakovtsev.introduction.algorithmization_2.decomposition;

import java.util.LinkedList;
import java.util.List;

//14. Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
//возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
//использовать декомпозицию.
public class Task14 {
    public static void main(String args[]) {

        int t[] = findAmstrNum(4_483_647L);
        for (int k : t)
            System.out.print(k + " ");
    }

    public static int[] findAmstrNum(long K) {
        int length = 1;
        int porog = 10;
        int r = 1;
        int s = 1;
        double k;
        List<Integer> list = new LinkedList<>();

        for (int i = 1; i < K; i++) {
            if (i == porog) {
                length++;
                porog *= 10;
            }
            s = i;
            k = 0;
            while (s > 0) {
                r = s % 10;
                k += Math.pow(r, length);
                if (k > i) break;
                s = s / 10;
            }
            if ((int) k == i)
                list.add(i);
        }
        int[] result = new int[list.size()];
        int i = 0;
        for (int n : list) {
            result[i] = n;
            i++;
        }

        return result;
    }
}





