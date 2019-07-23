package by.yakovtsev.introduction.string_basics_3.string_array;

public class Task5 {
    public static void main(String[] args) {
        String str = " Hi   hi 2  33 />?          and  hi  ";
        String res = str.replaceAll("[\\s]{2,}", " ").trim();
        System.out.println("Аfter removing spaces == " + res);

    }
}

