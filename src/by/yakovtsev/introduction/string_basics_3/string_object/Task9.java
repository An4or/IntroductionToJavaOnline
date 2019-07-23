package by.yakovtsev.introduction.string_basics_3.string_object;

public class Task9 {
    public static void main(String[] args) {
        String str = "Repeated Injections Русские не Учитываем";
        int res = str.length() - str.replaceAll("[a-zA-z]", "").length();
        System.out.println(res);
    }
}
