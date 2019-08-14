package by.yakovtsev.introduction.tasks_6.task1.model;

import java.io.Serializable;

public class Book implements Serializable {

    private transient int id;
    private String title;
    private Author author;
    private Publisher publisher;
    private int yearOfPublishing;

    public Book(int id, String title, Author author, Publisher publisher, int yearOfPublishing) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearOfPublishing = yearOfPublishing;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author.getFio();
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher.getName();
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    @Override
    public String toString() {
        return "Book" + "\n" +
                "ID: " + id + '\n' +
                "Title: " + title + '\n' +
                "Author: " + author.getFio() + '\n' +
                "Publisher: " + publisher.getName() + '\n' +
                "Year of publishing: " + yearOfPublishing + '\n';
    }
}
