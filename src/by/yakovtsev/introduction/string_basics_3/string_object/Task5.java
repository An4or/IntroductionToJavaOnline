package by.yakovtsev.introduction.string_basics_3.string_object;

public class Task5 {
    public static void main(String[] args) {
        String str = "Qwda asdf  fdkjlaa sda";
        int count = str.length() - str.replaceAll("a", "").length();
        System.out.println("a repeated == " + count);
    }
}
