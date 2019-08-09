package by.yakovtsev.introduction.string_basics_3.string_object;

//9. Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские
//буквы.
public class Task9 {
    public static void main(String[] args) {
        String str = "Repeated Injections Русские не Учитываем";
        int res = str.length() - str.replaceAll("[a-zA-z]", "").length();
        System.out.println(res);
    }
}
