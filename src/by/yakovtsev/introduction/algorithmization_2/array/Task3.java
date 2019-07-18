package by.yakovtsev.introduction.algorithmization_2.array;

public class Task3 {
    public static void main(String[] args) {
        countElement(59);
    }
    public static void countElement(int size){
        double [] numbers = new double[size];
        int countPlus = 0;
        int countMines = 0;
        int countZero = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = ((Math.random() - 0.5) * 30);
            if (numbers[i] > 0) {
                countPlus++;
            }else if(numbers[i]<0){
                countMines++;
            }else{
                countZero++;
            }
        }
        System.out.println("\ncountPlus == " + countPlus + " countMines == " + countMines + " countZero == " + countZero);
    }
}
