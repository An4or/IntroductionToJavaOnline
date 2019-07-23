package by.yakovtsev.introduction.string_basics_3.string_object;

public class Task8 {
    public static void main(String[] args) {
        String str = "Repeated injections would cause fever and or";

       getLongestWord(str);
    }

    private static String getLongestWord(String str){
        String words[] = str.split(" ");

        int len = 0;
        String longest = "";

        for (String string : words) {
            if (string.length() > len) {
                len = string.length();
                longest = string;
            }
        }

        System.out.println("The longest word is: " + longest);

        return longest;
    }

}
