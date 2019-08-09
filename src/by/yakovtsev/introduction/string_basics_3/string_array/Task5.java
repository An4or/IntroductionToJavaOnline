package by.yakovtsev.introduction.string_basics_3.string_array;

//5. Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
//Крайние пробелы в строке удалить.
public class Task5 {
    public static void main(String[] args) {
        String str = " Hi   hi 2  33 />?          and  hi  ";
        String res = str.replaceAll("[\\s]{2,}", " ").trim();
        System.out.println("Аfter removing spaces == " + res);

    }
}

