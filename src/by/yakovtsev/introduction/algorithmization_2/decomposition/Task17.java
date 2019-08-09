package by.yakovtsev.introduction.algorithmization_2.decomposition;

//17. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
//действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
public class Task17 {

    public static void main(String[] args){

        int number = 96;
        int itaration = 0;
        do{
            number = subtract(number, sumFromNumber(number));
            itaration++;
        }while (number > 0);
        System.out.println("Number of steps is " + itaration);
    }

    public static int sumFromNumber(int number){
        int sum = 0;
        do{
            sum += number % 10;
            number /= 10;
        }while(number > 0);
        return sum;
    }

    public static int subtract(int a, int b){
        return a - b;

    }
}
