package by.yakovtsev.introduction.algorithmization_2.array_sort;

import java.util.Arrays;

//5. Сортировка вставками. Дана последовательность чисел a1,a2,,an . Требуется переставить числа в порядке
//возрастания. Делается это следующим образом. Пусть a1,a2,,ai - упорядоченная последовательность, т. е.
//a1  a2  an . Берется следующее число ai+1 и вставляется в последовательность так, чтобы новая
//последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i +1 до n
//не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
//с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
public class Task5 {

    public static void main(String[] args) {
        sortInsertions(20);
    }

    public static void sortInsertions(int size) {
        int[] array = new int[size];


        System.out.print("Array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 30);
            System.out.print(array[i] + "; ");
        }

//        for (int i = 1; i < array.length; i++)
//        {
//            int currVal = array[i];
//            int keyPrev = i - 1;
//            while ((keyPrev >= 0)&&(currVal < array[keyPrev]))
//            {
//                array[keyPrev+1] = array[keyPrev];
//                array[keyPrev] = currVal;
//                keyPrev--;
//            }
//        }

        for (int i = 1; i < array.length; i++) {
            int newElement = array[i];
            int index;
            index = Arrays.binarySearch(array, 0, i, newElement);
            if (index < 0) {
                index = -(index) - 1;
            }
            System.arraycopy(array, index, array, index + 1, i - index);
            array[index] = newElement;
        }


        System.out.println("\nResult" + Arrays.toString(array));
    }
}
