package by.yakovtsev.introduction.string_basics_3.string_array;

//2. Замените в строке все вхождения 'word' на 'letter'.
public class Task2 {
    public static void main(String[] args) {
        String str = " word  word world ";
        str = str.replace("word", "letter");
        System.out.println(str);
    }
}
