package by.yakovtsev.introduction.algorithmization_2.decomposition;

public class Task11 {

    public static void main(String[] args) {
        compareNumbers(12312, 231232);
    }

    public static void  compareNumbers(int num1, int num2) {
        String str1 = num1 + "";
        String str2 = num2 + "";
        if (str1.length() != str2.length()){
            String str = (str1.length() > str2.length()) ? str1 :  str2;
            System.out.println("more digits is " + str );
        }else {
            System.out.println("digits are the same ");
        }
    }
}
