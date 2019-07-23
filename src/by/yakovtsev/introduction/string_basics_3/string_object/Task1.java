package by.yakovtsev.introduction.string_basics_3.string_object;

public class Task1 {
    public static void main(String[] args) {
        String str = "  Hi   hi 2  33 />?          and  hi  ";
        String[] spaces = str.split("\\S");
        int count = 0;
        for (String s: spaces) {
            if (s.chars().count() > count){
                count = (int) s.chars().count();
            }
        }
        System.out.println("Max spaces == " + count);
    }

}
