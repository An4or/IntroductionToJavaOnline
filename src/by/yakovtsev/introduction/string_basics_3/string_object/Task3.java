package by.yakovtsev.introduction.string_basics_3.string_object;

//3. Проверить, является ли заданное слово палиндромом.
public class Task3 {
    public static void main(String[] args) {
        isPalindrome("шалаш");
        isPalindrome("нешалаш");

    }

    public static void isPalindrome(String str){
        StringBuilder sb = new StringBuilder(str);
        if (str.equals(sb.reverse().toString())){
            System.out.println("The word palindrome");
        }else {
            System.out.println("The word is not a palindrome");
        }
    }
}
