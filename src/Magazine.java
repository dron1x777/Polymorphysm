import java.time.LocalDate;

public class Magazine extends Book {
    private int number;
    private int period;

    public Magazine(String title, String author, String publisher, double price, int pages, LocalDate year, int number, int period) {
        super(title, author, publisher, price, pages, year);
        this.number = number;
        this.period = period;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    @Override
    void getGenre() {
        System.out.println("Genre is magazine");
    }

    @Override
    void calculateReadingTime() {
        double readingTime = getPages() * 2;
        System.out.println("Reading time is: " + readingTime);
    }

    @Override
    int getAgeRestriction() {
        return 7;
    }

    @Override
    void getDescription() {
        System.out.println("Description is magazine");
    }
}
