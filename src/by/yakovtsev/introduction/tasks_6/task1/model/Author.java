package by.yakovtsev.introduction.tasks_6.task1.model;

import java.io.Serializable;
import java.util.Date;

public class Author implements Serializable {

    private int id;
    private String fio;
    private Date birthday;

    public Author(){
    }

    public Author(String fio) {
        this.fio = fio;
    }

    public Author(String fio, Date birthday) {
        this.fio = fio;
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
