package by.yakovtsev.introduction.algorithmization_2.array_sort;

import java.util.Arrays;

//7. Пусть даны две неубывающие последовательности действительных чисел a1  a2  an и b1  b2  bm .
//Требуется указать те места, на которые нужно вставлять элементы последовательности b1  b2  bm в первую
//последовательность так, чтобы новая последовательность оставалась возрастающей.
public class Task7 {
    public static void main(String[] args) {
        insertSequenceElements(7);
    }

    public static void insertSequenceElements(int size) {
        int[] firstArray = new int[size];
        int[] secondArray = new int[size];

        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = i;
            secondArray[i] = i + 4;
        }

        System.out.println("a array: "+ Arrays.toString(firstArray));
        System.out.println("b array: "+ Arrays.toString(secondArray));

        int i = 0;
        int j = 0;
        do{
            if(i < firstArray.length && j < secondArray.length) {
                if (firstArray[i] > secondArray[j]) {
                    System.out.println("insert b[" + j + "]" + " before a[" + i + "]");
                    if (j < secondArray.length) {
                        j++;
                    }
                } else {
                    if (i < firstArray.length) {
                        i++;
                    }
                }
            }else if(j < secondArray.length){
                System.out.println("Insert b[" + j + "] - b[" + (secondArray.length-1) + "] after the last element of array A");
                break;
            }else{
                break;
            }
        }while(i < firstArray.length || j < secondArray.length);

    }
}
