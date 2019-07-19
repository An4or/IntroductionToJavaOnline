package by.yakovtsev.introduction.algorithmization_2.decomposition;

import java.util.Arrays;

public class Task10 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fillArr(12345678)));
    }

    public static int[] fillArr(int num) {
        String str = num + "";
        int[] arrays = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arrays[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        return arrays;
    }
}
