import java.time.LocalDate;

public class TextBook extends Book {
    private String subject;
    private int grade;

    public TextBook(String title, String author, String publisher, double price, int pages, LocalDate year, String subject, int grade) {
        super(title, author, publisher, price, pages, year);
        this.subject = subject;
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    void getGenre() {
        System.out.println("Genre is scientist");
    }

    @Override
    void calculateReadingTime() {
        double readingTime = getPrice() * 2;
        System.out.println("Reading time is: " + readingTime);
    }

    @Override
    int getAgeRestriction() {
        return 16;
    }

    @Override
    void getDescription() {
        System.out.println("Description is scientist");
    }
}
