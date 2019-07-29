package by.yakovtsev.introduction.programming_with_classes_4.classes_and_objects.task9;

public class Book {

    protected enum Cover{
        SOFT, HARD

    }

    private static int idCounter;
    private int id;
    private String titel;
    private String author;
    private String publishing;
    private int year;
    private int pages;
    private double price;
    private Cover cover;

    public Book(String titel, String author, String publishing, int year, int pages, double price, Cover cover) {
        id += ++idCounter;
        this.titel = titel;
        this.author = author;
        this.publishing = publishing;
        this.year = year;
        this.pages = pages;
        this.price = price;
        this.cover = cover;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishing() {
        return publishing;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Cover getCover() {
        return cover;
    }

    public void setCover(Cover cover) {
        this.cover = cover;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", titel='" + titel + '\'' +
                ", author='" + author + '\'' +
                ", publishing='" + publishing + '\'' +
                ", year=" + year +
                ", pages=" + pages +
                ", price=" + price +
                ", cover=" + cover +
                '}';
    }
}
