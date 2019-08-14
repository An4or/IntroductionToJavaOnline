package by.yakovtsev.introduction.tasks_6.task1.util;

import by.yakovtsev.introduction.ConsoleHelper;
import by.yakovtsev.introduction.tasks_6.task1.model.*;
import org.mindrot.jbcrypt.BCrypt;

import java.util.List;

public class MenuUtil {

    private static int choicePosition(int min, int max) {
            int res = ConsoleHelper.readInt();
            if (res < min || res > max) {
                System.out.println("Invalid input: try again");
                return choicePosition(min, max);
            }else {
                return res;
            }
    }

    private static void printBooks(List<Book> books) {
        int index = 0;
        while (true) {
            for (int i = index; i < Integer.min(books.size(), index + 4); i++) {
                System.out.println(books.get(i));
            }

            System.out.println("1 - next page, 2 - previous page, 3 - exit");
            int choice = choicePosition(1, 3);
            if (choice == 1) {
                index += 4;
                if (index >= books.size()) {
                    index -= 4;
                }
            } else if (choice == 2) {
                index = Integer.max(0, index - 4);
            } else {
                return;
            }
        }
    }

    private static User getUser(boolean admin) {
        System.out.println("Enter email: ");
        String email = ConsoleHelper.readString();
        System.out.println("Enter login: ");
        String login = ConsoleHelper.readString();
        System.out.println("Enter password: ");
        String password = ConsoleHelper.readString();

        return new User(login, email, BCrypt.hashpw(password, BCrypt.gensalt()), admin);

    }

    private static void findBook(BookUtil books) {
        System.out.println("1. Search by id");
        System.out.println("2. Search by title");
        System.out.println("3. Search by author");
        System.out.println("4. Search by publisher");
        System.out.println("5. Search by year of publishing");
        int choice2 = choicePosition(1, 5);

        if (choice2 == 1) {
            System.out.print("Enter id:");
            int id = choicePosition(0, Integer.MAX_VALUE);
            Book book = books.findBookById(id);
            System.out.println(book == null ? "Book is not found" : book);

        } else if (choice2 == 2) {
            System.out.print("Enter title:");
            String title = ConsoleHelper.readString();
            List<Book> filtered = books.filterByTitle(title);
            printBooks(filtered);

        } else if (choice2 == 3) {
            System.out.print("Enter author:");
            String author = ConsoleHelper.readString();
            List<Book> filtered = books.filterByAuthor(author);
            printBooks(filtered);

        } else if (choice2 == 4) {
            System.out.print("Enter publisher:");
            String publisher = ConsoleHelper.readString();
            List<Book> filtered = books.filterByPublisher(publisher);
            printBooks(filtered);

        } else if (choice2 == 5) {
            System.out.print("Enter range start year and finish year:");
            int startYear = ConsoleHelper.readInt();
            int finishYear = ConsoleHelper.readInt();
            ConsoleHelper.readString();

            List<Book> filtered = books.filterByYear(startYear, finishYear);
            printBooks(filtered);
        }
    }


    private static void addBook(BookUtil books) {

        System.out.println("Adding new book...");
        System.out.print("Title: ");
        String title = ConsoleHelper.readString();
        System.out.print("Author: ");
        String author = ConsoleHelper.readString();
        System.out.print("Publisher: ");
        String publisher = ConsoleHelper.readString();
        System.out.print("Year of publishing: ");
        int year = ConsoleHelper.readInt();
        ConsoleHelper.readString();

        Book book;
        System.out.println("Is it e-book? (1 - yes, 2 - no)");
        int choice3 = choicePosition(1, 2);
        if (choice3 == 1) {
            System.out.println("Enter web location of this book (URL, website, etc.)");
            String location = ConsoleHelper.readString();
            book = new Ebook(0, title, new Author(author), new Publisher(publisher), year, location);
        } else {
            book = new Book(0, title, new Author(author), new Publisher(publisher), year);
        }

        books.addBook(book);
    }

    private static void removeBook(BookUtil books) {

        System.out.println("Enter book id: ");
        int id = choicePosition(Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (books.removeBook(id)) {
            System.out.println("Successful");
        } else {
            System.out.println("Error: book is not found");
        }
    }

    public static void choiceMenu(){
        UserUtil users = new UserUtil();
        BookUtil books = new BookUtil();

        boolean logged = false;
        User user = null;

        while (!logged) {
            System.out.println("1. Register new user");
            System.out.println("2. Register new admin");
            System.out.println("3. Login");
            int choice = choicePosition(1, 3);

            if (choice == 1) {

                User newUser = getUser(false);

                if (!users.checkLogin(newUser.getLogin())) {
                    System.out.println("This username is used by another user");
                    System.out.println("Registration cancelled");
                } else {
                    users.addUser(newUser);
                }

            } else if (choice == 2) {
                System.out.println("Enter master password: ");
                String masterPassword = ConsoleHelper.readString();
                if (users.loginMaster(masterPassword)) {
                    System.out.println("OK\n");

                    User newUser = getUser(true);

                    if (!users.checkLogin(newUser.getLogin())) {
                        System.out.println("This username is used by another user");
                        System.out.println("Registration cancelled");
                    } else {
                        users.addUser(newUser);
                    }
                }
            } else {
                System.out.println("Enter login: ");
                String login = ConsoleHelper.readString();
                System.out.println("Enter password: ");
                String password = ConsoleHelper.readString();
                user = users.login(login, password);
                if (user == null) {
                    System.out.println("Failed");
                } else {
                    System.out.println("Ok, logged");
                    logged = true;
                }
            }

            System.out.println("Press enter to continue...");
            ConsoleHelper.readString();
        }

        boolean exit = false;

        if (user.isAdmin()) {
            bookMenuAdmin(exit, books);
        } else {
            bookMenuUser(exit, books);
        }
        user.logout();

        users.saveToFile();
        books.saveToFile();
    }

    private static void bookMenuAdmin(boolean exit, BookUtil books){
        while (!exit) {
            System.out.println("Menu");
            System.out.println("1. Find book");
            System.out.println("2. Show all books");
            System.out.println("3. Add new book");
            System.out.println("4. Remove book");
            System.out.println("5. Exit");
            int choice = choicePosition(1, 5);

            if (choice == 1) {
                findBook(books);
            } else if (choice == 2) {
                printBooks(books.filterByYear(Integer.MIN_VALUE, Integer.MAX_VALUE));
            } else if (choice == 3) {
                addBook(books);
            } else if (choice == 4) {
                removeBook(books);
            } else if (choice == 5) {
                exit = true;
            }
        }
    }

    private static void bookMenuUser(boolean exit, BookUtil books){
        while (!exit) {
            System.out.println("Menu");
            System.out.println("1. Find book");
            System.out.println("2. Show all books");
            System.out.println("3. Exit");
            int choice = choicePosition(1, 3);

            if (choice == 1) {
                findBook(books);
            } else if (choice == 2) {
                printBooks(books.filterByYear(Integer.MIN_VALUE, Integer.MAX_VALUE));
            } else if (choice == 3) {
                exit = true;
            }
        }
    }

}
