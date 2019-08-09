package by.yakovtsev.introduction.string_basics_3.string_object;

//7. Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cde
//def", то должно быть выведено "abcdef".
public class Task7 {
    public static void main(String[] args) {
        String str = "Repeated injections would cause fever, and abscesses at the site.";
String res = str.replaceAll("(.)(?=.*\\1)", "").replaceAll(" ", "");
        System.out.println(res);
    }
}
