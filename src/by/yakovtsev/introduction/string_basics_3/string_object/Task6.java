package by.yakovtsev.introduction.string_basics_3.string_object;

//6. Из заданной строки получить новую, повторив каждый символ дважды.
public class Task6 {
    public static void main(String[] args) {
        String str = "Repeated injections would cause fever, and abscesses at the site.";
        System.out.println(doubleText(str));
    }

    public static String doubleText(String text){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++){
            sb.append(text.charAt(i));
            sb.append(text.charAt(i));
        }
        return sb.toString();
    }
}
