import java.time.LocalDate;

public abstract class Book {
    private String title;
    private String author;
    private String publisher;
    private double price;
    private int pages;
    private LocalDate year;

    public Book(String title, String author, String publisher, double price, int pages, LocalDate year) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        this.pages = pages;
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
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

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getYear() {
        return year;
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }

    abstract void getGenre();
    abstract void calculateReadingTime();
    abstract  int getAgeRestriction();
    abstract void getDescription();
    void displayBookInfo() {
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Publisher: " + getPublisher());
        System.out.println("Price: " + getPrice());
        System.out.println("Pages: " + getPages());
        System.out.println("Year: " + getYear());
    }
}
