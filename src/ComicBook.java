import java.time.LocalDate;

public class ComicBook extends Book{
    private int countOfSeries;
    private String illustration;

    public ComicBook(String title, String author, String publisher, double price, int pages, LocalDate year, int countOfSeries, String illustration) {
        super(title, author, publisher, price, pages, year);
        this.countOfSeries = countOfSeries;
        this.illustration = illustration;
    }

    public int getCountOfSeries() {
        return countOfSeries;
    }

    public void setCountOfSeries(int countOfSeries) {
        this.countOfSeries = countOfSeries;
    }

    public String getIllustration() {
        return illustration;
    }

    public void setIllustration(String illustration) {
        this.illustration = illustration;
    }

    @Override
    void getGenre() {
        System.out.println("Genre is comic book");
    }

    @Override
    void calculateReadingTime() {
        double readingTime = getPages() * 2;
        System.out.println("Reading time: " + readingTime);
    }

    @Override
    int getAgeRestriction() {
        return 3;
    }

    @Override
    void getDescription() {
        System.out.println("Description is comic book");
    }
}
