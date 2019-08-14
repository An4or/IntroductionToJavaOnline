package by.yakovtsev.introduction.tasks_6.task1.util;


import by.yakovtsev.introduction.tasks_6.task1.model.Author;
import by.yakovtsev.introduction.tasks_6.task1.model.Book;
import by.yakovtsev.introduction.tasks_6.task1.model.Ebook;
import by.yakovtsev.introduction.tasks_6.task1.model.Publisher;

import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookUtil {

    private static int bookIdCounter = 0;

    private List<Book> books;
    private File saveFile;

    public BookUtil() {
        bookUtil();
    }

    private void bookUtil() {
        books = new ArrayList<>();

        saveFile = new File("src/resources/text/books.txt");

        if (saveFile.exists() && saveFile.canRead()) {

            try (Scanner in = new Scanner(new FileReader(saveFile))) {

                while (in.hasNextLine()) {
                    String bookType = in.nextLine();
                    String title = in.nextLine();
                    String author = in.nextLine();
                    String publisher = in.nextLine();
                    int year = in.nextInt();
                    in.nextLine();
                    if (bookType.toLowerCase().equals("e")) {
                        String location = in.nextLine();
                        Ebook ebook = new Ebook(0, title, new Author(author), new Publisher(publisher), year, location);
                        addBook(ebook);
                    } else {
                        Book book = new Book(0, title, new Author(author), new Publisher(publisher), year);
                        addBook(book);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void saveToFile() {
        if (!saveFile.exists()) {
            try {
                saveFile.createNewFile();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if (saveFile.setWritable(true)) {
            try (PrintWriter out = new PrintWriter(saveFile)) {

                for (Book book : books) {
                    out.println(book instanceof Ebook ? "e" : "p");
                    out.println(book.getTitle());
                    out.println(book.getAuthor());
                    out.println(book.getPublisher());
                    out.println(book.getYearOfPublishing());
                    if (book instanceof Ebook) {
                        out.println(((Ebook) book).getLocation());
                    }
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Error: Unable to save file");
        }
    }


    public void addBook(String name, String author, String publisher, int yearOfPublishing) {
        Book book = new Book(bookIdCounter++, name, new Author(author), new Publisher(publisher), yearOfPublishing);
        books.add(book);
    }

    public void addBook(Book book) {
        book.setId(bookIdCounter++);
        books.add(book);
    }

    public Book findBookById(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    public List<Book> filterByTitle(String title) {

        List<Book> filteredBooks = new ArrayList<>();

        for (Book book : books) {
            if (book.getTitle().toLowerCase().equals(title.toLowerCase())) {
                filteredBooks.add(book);
            }
        }

        return (filteredBooks.size() > 0 ? filteredBooks : null);
    }

    public List<Book> filterByAuthor(String author) {

        List<Book> filteredBooks = new ArrayList<>();

        for (Book book : books) {
            if (book.getAuthor().toLowerCase().equals(author.toLowerCase())) {
                filteredBooks.add(book);
            }
        }

        return (filteredBooks.size() > 0 ? filteredBooks : null);
    }

    public List<Book> filterByPublisher(String publisher) {

        List<Book> filteredBooks = new ArrayList<>();

        for (Book book : books) {
            if (book.getPublisher().toLowerCase().equals(publisher.toLowerCase())) {
                filteredBooks.add(book);
            }
        }

        return (filteredBooks.size() > 0 ? filteredBooks : null);
    }

    public List<Book> filterByYear(int filterStart, int filterFinish) {

        List<Book> filteredBooks = new ArrayList<>();

        for (Book book : books) {
            if (filterStart <= book.getYearOfPublishing() && book.getYearOfPublishing() <= filterFinish) {
                filteredBooks.add(book);
            }
        }

        return (filteredBooks.size() > 0 ? filteredBooks : null);
    }

    public boolean removeBook(Book book) {
        return books.remove(book);
    }

    public boolean removeBook(int id) {
        return books.remove(findBookById(id));
    }


}
