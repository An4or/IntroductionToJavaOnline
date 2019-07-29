package by.yakovtsev.introduction.programming_with_classes_4.classes_and_objects.task9;

import java.util.ArrayList;
import java.util.List;

public class Shop {
private List<Book> bookList = new ArrayList<>();

    public Shop(Book book) {
        this.bookList.add(book);
    }

    public Shop(Book ... books){
        for (Book book: books){
            bookList.add(book);
        }
    }

    public void filterAuthor(String author){
        bookList.stream().filter(x -> author.equals(x.getAuthor()))
                .forEach(System.out::println);
    }

    public void filterPublisher(String publishing){
        bookList.stream().filter(x -> publishing.equals(x.getPublishing()))
                .forEach(System.out::println);
    }

    public void filterAfterYear(int year){
        bookList.stream().filter(x -> x.getYear() >= year)
                .forEach(System.out::println);
    }



    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
}
