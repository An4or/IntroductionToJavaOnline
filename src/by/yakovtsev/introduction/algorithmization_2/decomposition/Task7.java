package by.yakovtsev.introduction.algorithmization_2.decomposition;

//7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
public class Task7 {

    public static void main(String[] args) {
        summFact();
    }

    public static void summFact(){
        long summ = 0;
        for (int i = 1; i <= 9; i+=2){
            summ += fact(i);
            System.out.println("factorial " + i + " = " + fact(i));
        }
        System.out.println("Summ factorial 1, 3, 5, 7, 9 == " + summ);
    }

    public static int fact(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

}
