package by.yakovtsev.introduction.programming_with_classes_4.classes_and_objects.task3;

import java.util.Arrays;

public class Student {

    private String initials;
    private int group;
    private int[] performance = new int[5];

    public Student(String initials, int group, int[] performance) {
        this.initials = initials;
        this.group = group;
        this.performance = performance;
    }

    public static void main(String[] args) {
        Student [] students =          {
                                new Student("A.Sidorov1", 11, new int[]{1,2,3,4,5}),
                                new Student("A.Sidorov2", 12, new int[]{9,9,10,9,9}),
                                new Student("A.Sidorov3", 13, new int[]{10,9,10,9,9}),
                                new Student("A.Sidorov4", 14, new int[]{5,9,10,9,9}),
                                new Student("A.Sidorov5", 14, new int[]{5,9,6,9,9}),
                                new Student("A.Sidorov6", 11, new int[]{10,10,10,9,9}),
                                new Student("A.Sidorov7", 15, new int[]{1,2,3,4,5}),
                                new Student("A.Sidorov8", 11, new int[]{1,2,3,4,5}),
                                new Student("A.Sidorov9", 11, new int[]{1,2,3,4,5}),
                                new Student("A.Sidorov10", 11, new int[]{1,2,3,4,5}),
                                };

        for (Student s: students){
            s.excellent();
        }

    }



    public void excellent(){
        int mark = 0;
        for (int i : performance){
            mark += i;
        }
        if (mark / 5 > 8){
            System.out.println(toString());
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "initials='" + initials + '\'' +
                ", group=" + group +
                ", performance=" + Arrays.toString(performance) +
                '}';
    }
}
