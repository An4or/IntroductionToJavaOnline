package by.yakovtsev.introduction.programming_with_classes_4;

import java.util.Arrays;

public class A {
    private int[] args;
    private String[] s;

    {
        System.out.println("Это нестатический блок!");
    }

    {
        System.out.println("Это нестатический блок2!");
    }

    static {
        System.out.println("Это нестатический блок3!");
    }

    static {
        System.out.println("Это нестатический блок4!");
    }
    {
        System.out.println("Это нестатический блок5!");
    }

    {
        System.out.println("Это нестатический блок6!");
    }

    public static void main(String[] args) {
A a = new A();
a.aVoid(new int []{1,2,3});
        Class resB = A.class;

        System.out.println(a.toString());
    }

    public void aVoid(){

    }

    protected void aVoid(int i){
        System.out.println("int i" + i);
    }

    private void aVoid(int i, int j){

    }



    private void aVoid(String... s){

        System.out.println(Arrays.toString(args));
    }
    private void aVoid(int... s){
for (int i: s){
    System.out.println(i);
}
        System.out.println(Arrays.toString(args));
        System.out.println(s.toString());
    }

    public static void arr(int b){

    }

    public static void arr(int b, int c){

    }



}
