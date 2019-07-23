package by.yakovtsev.introduction.string_basics_3.string_object;

public class Task4 {
    public static void main(String[] args) {
        isWord("информатика", "торт");
    }

    public static boolean isWord(String oldWord, String newWord) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < newWord.length(); i++) {
            if (!oldWord.contains(String.valueOf(newWord.charAt(i)))) {
                System.out.println("From this word \"" + oldWord + "\" to make a word \"" + newWord + "\"");
                return false;
            }
            sb.append(String.copyValueOf(oldWord.toCharArray(), oldWord.indexOf(newWord.charAt(i)), 1));
        }
        System.out.println("From this word \"" + oldWord + "\" you can make a word \"" + sb.toString() + "\"");

        return true;
    }
}
