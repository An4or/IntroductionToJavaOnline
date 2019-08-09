package by.yakovtsev.introduction.algorithmization_2.decomposition;

//8. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
//Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
//массива с номерами от k до m.
public class Task8 {

    public static void main(String[] args) {
        int [] arr = ramdomFillArr(12);
        System.out.println("Summa elements == " + summArrayElem(arr, 8));
    }

    public static int[] ramdomFillArr(int size) {
        int[] arrays = new int[size];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = (int) (Math.random() * 25);
        }
        return arrays;
    }

    public static int summArrayElem(int [] arr, int from){
        int summElemm = 0;
        int to = from + 3;

        try {
            for (int i = from; i <= to; i++) {
                summElemm += arr[i];
            }
        }catch (Exception e){
            System.out.println(e);
            return 0;
        }

        return summElemm;
    }
}
