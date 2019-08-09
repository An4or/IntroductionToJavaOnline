package by.yakovtsev.introduction.programming_with_classes_4.classes_and_objects.task1;

//1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
//переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
//наибольшее значение из этих двух переменных.
public class Test1 {

    private int val1;
    private int val2;

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.setVal1(5);
        test1.setVal2(10);
        test1.printConsole();
    }

    public void printConsole(){
        System.out.println(toString());
        System.out.println("Summ: " + summ());
        System.out.println("Max value: " + maxVal());
    }

    public int summ(){
        return val1 + val2;
    }

    public int maxVal(){
        return Math.max(val1, val2);
    }

    public void setVal1(int val1) {
        this.val1 = val1;
    }

    public void setVal2(int val2) {
        this.val2 = val2;
    }

    @Override
    public String toString() {
        return "Test1{" +
                "val1=" + val1 +
                ", val2=" + val2 +
                '}';
    }
}
