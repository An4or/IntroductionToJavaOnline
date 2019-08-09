package by.yakovtsev.introduction.basics_of_software_1;

import java.awt.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

/*
1. Basics of software code development
Решаем задачи для закрепления навыков
 */
public class Basics {
    public static void main(String[] args) {
        //Линейные программы
        task1(5, 4, 1);
        task2(1, 2, 3);
        task3(5, 5);
        task4(222.333);
        task5(120995);
        task6(2, 4);

        //Ветвления
        task21(90, 90);
        task22(5, 4, 9, 7);
        task23(new Point(4, 5), new Point(2, 1), new Point(5, 3));
        task24(30, 200);
        task25(3);

        //Циклы
        task31(15);
        task32(2, 8, 0.5);
        task33();
        task34();
        task35(4, 0.2);
        task36();
        task37(2, 20);
        task38(22, 22);
    }

    //Линейные программы task1-task6
    //1.Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.
    public static void task1(double a, double b, double c) {
        double z = ((a - 3) * b / 2) + c;
        System.out.println("z = " + z);
    }

    //2.Вычислить значение выражения по формуле (все переменные принимают действительные значения):
    public static void task2(double a, double b, double c) {
        double res = (b + Math.sqrt((Math.pow(b, 2) + 4 * a * c)) / (2 * a)) - (Math.pow(a, 3) * c + Math.pow(b, -2));
        System.out.println("result = " + res);
    }

    //3.Вычислить значение выражения по формуле (все переменные принимают действительные значения)
    public static void task3(double x, double y) {
        double res = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);
        System.out.println("result = " + res);
    }

    //4.Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
    //дробную и целую части числа и вывести полученное значение числа.
    public static void task4(double a) {
        int n = (int) a;
        double d = (a - n) * 1000;
        BigDecimal res = new BigDecimal(d + n / 1000.0);
        System.out.println("result = " + res.setScale(3, BigDecimal.ROUND_CEILING));
    }

    //5.Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
    //данное значение длительности в часах, минутах и секундах в следующей форме:
    //ННч ММмин SSc.
    public static void task5(int t) {
        int input = t;
        int hours = (input % 86400) / 3600;
        int minutes = ((input % 86400) % 3600) / 60;
        int seconds = ((input % 86400) % 3600) % 60;
        System.out.println(hours + "ч " + minutes + "мин " + seconds + "с");
    }

    //6.Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
    //принадлежит закрашенной области, и false — в противном случае
    public static void task6(int x, int y) {
        boolean left = (x >= -2 && x <= 2 && y >= -3 && y <= 4);
        boolean right = ((x >= -4 && x <= 4 && y >= -3 && y <= 0));
        System.out.println(left || right);
    }

    //Ветвления task21-task25
    //1.Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
    //он прямоугольным.
    public static void task21(double firstCorn, double secondCorn) {
        double sumCorn = firstCorn + secondCorn;
        if (sumCorn > 0 && sumCorn < 180) {
            if (sumCorn < 90) {
                System.out.println("тупоугольный треугольник");
            } else if (sumCorn == 120 && firstCorn == secondCorn) {
                System.out.println("правильный треугольник");
            } else if (sumCorn == 90 || firstCorn == 90 || secondCorn == 90) {
                System.out.println("прямоугольный треугольник");
            } else {
                System.out.println("остроугольный треугольник");
            }
        } else {
            System.out.println("такого треугольника не существует.");
        }
    }

    //2.Найти max{min(a, b), min(c, d)}.
    public static void task22(int a, int b, int c, int d) {
        System.out.println(Math.max(Math.min(a, b), Math.min(c, d)));
    }

    //3.Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
    public static void task23(Point a, Point b, Point c) {
        String oneStraight = "точки на одной прямой";
        String notStraight = "точки не на одной прямой";
        String res = "";
        if (b.y - a.y == 0) {
            res = (c.y == a.y ? oneStraight : notStraight);
        } else if ((b.x - a.x) == 0) {
            res = (c.x == a.x ? oneStraight : notStraight);
        } else if (((c.x - a.x) / (b.x - a.x)) == ((c.y - a.y) / (b.y - a.y))) {
            res = oneStraight;
        } else {
            res = notStraight;
        }
        System.out.println(res);
    }

    //4.Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
    //отверстие.
    public static void task24(int a, int b) {
        int x = 120;
        int y = 65;
        int z = 250;
        if (((a >= x) && (b >= y))
                || ((a >= y) && (b >= x))
                || ((a >= x) && (b >= z))
                || ((a >= z) && (b >= x))
                || ((a >= y) && (b >= z))
                || ((a >= z) && (b >= y))) {
            System.out.println("Кирпич проходит");
        } else {
            System.out.println("Кирпич не проходит");
        }
    }

    //5.Вычислить значение функции.
    public static void task25(double x) {
        double res = (x <= 3 ? Math.pow(x, 2) - 3 * x + 9 : 1 / (Math.pow(x, 3) + 6));
        System.out.println(res);
    }

    //Циклы task31-task38
    //1.Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
    //все числа от 1 до введенного пользователем числа.
    public static void task31(int x) {
        int summ = 0;
        for (int i = 1; i <= x; i++) {
            summ += i;
        }
        System.out.println(summ);
    }

    //2.Вычислить значения функции на отрезке [а,b] c шагом h
    public static void task32(double firstX, double lastX, double stepH) {
        while (firstX <= lastX && lastX >= firstX) {
            double result = (firstX > 2 ? firstX : -firstX);
            System.out.println("result: " + result);
            firstX += stepH;
        }
    }

    //3.Найти сумму квадратов первых ста чисел.
    public static void task33() {
        int summ = 0;
        for (int i = 1; i <= 100; i++) {
            summ += Math.pow(i, 2);
        }
        System.out.println(summ);
    }

    //4.Составить программу нахождения произведения квадратов первых двухсот чисел.
    public static void task34() {
        BigInteger summ = new BigInteger("0");
        BigInteger res = new BigInteger("1");

        for (int i = 1; i <= 200; i++) {
            summ = summ.add(BigInteger.valueOf(i));
            res = res.multiply(summ.pow(2));
        }
        System.out.println(res);
    }

    //5.Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
    //заданному е. Общий член ряда имеет вид.
    public static void task35(int rowLength, double e) {
        double summ = 0;
        for (int i = 1; i <= rowLength; i++) {
            double a = (1 / Math.pow(2, i) + 1 / Math.pow(3, i));
            if (a >= Math.abs(e)) {
                summ += a;
                System.out.println("n = " + i);
            }
            System.out.println("a = " + a);
        }
        System.out.println("result " + summ);
    }

    //6.Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
    public static void task36() {
        String symbol = "Выводим соответствии между символами...";
        for (int i = 0; i < symbol.length(); i++) {
                System.out.println(symbol.charAt(i) + " => " + symbol.codePointAt(i));
            }
    }

    //7.Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
    //m и n вводятся с клавиатуры.
    public static void task37(int m, int n) {
        while (m < n){
            m++;
            for (int i = 2; i < m; i++) {
                if (m % i == 0){
                    System.out.println(i + " => " + m);
                }
            }
        }
    }

    //8.Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
    public static void task38(int firstNumber, int secondNumber) {
        int firstCounter = 0;
        int firstNumberForLength = firstNumber;

        do{
            firstNumberForLength /= 10;
            firstCounter++;
        }while(firstNumberForLength > 0);

        System.out.println("first length " + firstCounter);

        int secondCounter = 0;
        int secondNumberForLength = secondNumber;

        do{
            secondNumberForLength /= 10;
            secondCounter++;
        }while(secondNumberForLength > 0);

        System.out.println("second lenght " + secondCounter);

        int [] firstElemArray = new int[firstCounter];

        for (int i = 0; i < firstElemArray.length; i++){
            firstElemArray[i] = firstNumber % 10;
            firstNumber /= 10;
        }

        System.out.println("first elements " + Arrays.toString(firstElemArray));

        int [] secondElemArray = new int[secondCounter];

        for(int i = 0; i < secondElemArray.length; i++) {
            secondElemArray[i] = secondNumber % 10;
            secondNumber /= 10;
        }

        System.out.println("second elements " + Arrays.toString(secondElemArray));
        System.out.println("Elements which contains in both numbers: ");

        for(int i = 0; i < firstElemArray.length; i++){
            for (int j = 0; j < secondElemArray.length; j++){
                if(firstElemArray[i] == secondElemArray[j]){
                    System.out.print(firstElemArray[i] + ", ");
                    break;
                }
            }
        }
    }

}


