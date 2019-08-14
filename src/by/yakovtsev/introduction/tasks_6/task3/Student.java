package by.yakovtsev.introduction.tasks_6.task3;

import java.io.Serializable;

public class Student implements Serializable {
    private static volatile int idStudent = 1;
    private int id;
    private String name;
    private int age;
    private String note;

    public Student() {
        this.id += idStudent++;
    }

    public Student(String name, int age, String note) {
        this.id += idStudent++;
        this.name = name;
        this.age = age;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", note='" + note + '\'' +
                '}';
    }
}
