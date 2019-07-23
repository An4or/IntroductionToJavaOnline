package by.yakovtsev.introduction.string_basics_3.string_array;


import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        camelInSnake();
    }

    public static void camelInSnake() {
        String[] camelCase = {"camelSnake", "camelSnakeTwo", "camelSnakeThree"};
        StringBuilder sb = new StringBuilder();
        for (String s : camelCase) {
            for (int i = 0; i < s.length(); i++) {
                if (Character.isUpperCase((s.charAt(i)))){
                    sb.append("_");
                    sb.append(s.charAt(i));
                }else {
                    sb.append(s.charAt(i));
                }
            }
            sb.append(" ");
        }
        String [] snakeCase = sb.toString().toLowerCase().split(" ");
        System.out.println(Arrays.toString(snakeCase));
    }

}
