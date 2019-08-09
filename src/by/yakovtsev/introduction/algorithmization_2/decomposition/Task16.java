package by.yakovtsev.introduction.algorithmization_2.decomposition;

//16. Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
//Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
public class Task16 {
    public static void main(String[] args) {
        int number = 799999224;
        System.out.println(summOddNum(number));
        summEvenNum(summOddNum(number));

    }

    public static int summOddNum(int number) {
        return summEvenOrOddNum(number, false);
    }


    public static void summEvenNum(int number) {
        System.out.println("Number of even numbers in result is " + summEvenOrOddNum(number, true));
    }

    private static int summEvenOrOddNum(int number, boolean b) {
        int sum = 0;
        String str = number + "";

        for (int i = 0; i < str.length(); i++) {
            int tmp = Integer.parseInt(String.valueOf(str.charAt(i)));
            if (tmp % 2 != 0 && !b) {
                sum += tmp;
            }
            if (tmp % 2 == 0 && b) {
                sum ++;
            }
        }
        return sum;
    }

}
