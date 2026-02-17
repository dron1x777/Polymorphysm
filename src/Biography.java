import java.time.LocalDate;

public class Biography extends Book{
    private int period;
    private String nameAndSurname;

    public Biography(String title, String author, String publisher, double price, int pages, LocalDate year, int period, String nameAndSurname) {
        super(title, author, publisher, price, pages, year);
        this.period = period;
        this.nameAndSurname = nameAndSurname;
    }

    public String getNameAndSurname() {
        return nameAndSurname;
    }

    public void setNameAndSurname(String nameAndSurname) {
        this.nameAndSurname = nameAndSurname;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    @Override
    void getGenre() {
        System.out.println("biography genre");
    }

    @Override
    void calculateReadingTime() {
        double readingTime = getPages() * 2;
        System.out.println("Reading time is: " + readingTime);
    }

    @Override
    int getAgeRestriction() {
        return 18;
    }

    @Override
    void getDescription() {
        System.out.println("Description biography");
    }
}
