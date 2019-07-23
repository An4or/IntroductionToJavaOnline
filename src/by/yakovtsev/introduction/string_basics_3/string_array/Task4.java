package by.yakovtsev.introduction.string_basics_3.string_array;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        String str = "1Test345 34 test 234 234test234 dkjsadl 44343";
        String[] res = str.replaceAll("\\D", " ").split(" ");
        int count = 0;
        for (String s : res) {
            if (s.length() > 0) {
                count++;
            }

        }
        System.out.println("Count Numbers is line == " + count + "\n" + Arrays.toString(res));
    }
}
