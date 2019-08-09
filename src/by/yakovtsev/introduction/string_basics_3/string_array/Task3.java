package by.yakovtsev.introduction.string_basics_3.string_array;

//3. В строке найти количество цифр.
public class Task3 {
    public static void main(String[] args) {
        String str = "Test345 34 test 234 234test234 dkjsadl 44343";
        int res = str.length() - str.replaceAll("\\d", "").length();
        System.out.println("Numbers is line == " + res);
    }
}
