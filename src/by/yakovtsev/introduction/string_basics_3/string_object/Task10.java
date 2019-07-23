package by.yakovtsev.introduction.string_basics_3.string_object;

import java.util.StringTokenizer;

public class Task10 {
    public static void main(String[] args) {
        String str = "Our Earth is so beautiful. " +
                "There, are! a lot of! blue rivers and lakes on the Earth!" +
                " Its oceans are full of wonders?" +
                " There are high mountains covered with snow and wonderful fields and forests full of different plants and animals.";
        StringTokenizer st = new StringTokenizer(str, ".!?");

        System.out.println("The number of sentences in the string == " + st.countTokens());
    }
}
