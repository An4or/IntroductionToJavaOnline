package by.yakovtsev.introduction.algorithmization_2.array;

//7. Даны действительные числа a1,a2,,an . Найти
//max( a1 + a2n,a2 + a2n−1,,an + an+1) .
public class Task7 {
    public static void main(String[] args) {
        searchMax(20);
    }

    public static void searchMax(int size) {
        double[] numbers = new double[size];
        double[] numbersMax = new double[size/2];

        double maxValue  = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (Math.random() * 30);
        }
        for (int i = 0; i < numbersMax.length; i++) {
            numbersMax[i] = numbers[i] + numbers[numbers.length-1-i];
            if (numbersMax[i] > maxValue){
                maxValue = numbersMax[i];
            }
        }
        System.out.println("\nmaxValue == " + maxValue);
    }


}
