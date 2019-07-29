package by.yakovtsev.introduction.programming_with_classes_4.classes_and_objects.task9;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop(
new Book("The Fisherman and His Soul", "Oscar Wilde", "DorPub", 2019, 234,10, Book.Cover.SOFT),
                new Book("The Million Pound Bank Note", "Mark Twain", "DorPub", 2015, 100, 5,Book.Cover.SOFT),
                new Book("Thinking in Java","Bruce Eckel","Prentice Hall", 2006, 1079,79.5 ,Book.Cover.HARD),
                new Book("Head First Java","Bert Bates, Kathy Sierra"," O'Reilly Media, Inc.",2005,690, 30.7, Book.Cover.SOFT),
                new Book("Dracula", "Bram Stoker", "DorPub", 2003, 334,15, Book.Cover.HARD)
        );

        System.out.println("Filter by author");
        shop.filterAuthor("Oscar Wilde");

        System.out.println("Filter by publisher");
        shop.filterPublisher("DorPub");

        System.out.println("Filter by year of publication");
        shop.filterAfterYear(2005);

    }
}
