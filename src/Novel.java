import java.time.LocalDate;

public class Novel extends Book {
    private String genre;
    private String typeOfGenre;
    public Novel(String title, String author, String publisher, double price, int pages, LocalDate year, String genre, String typeOfGenre) {
        super(title, author, publisher, price, pages, year);
        this.genre = genre;
        this.typeOfGenre = typeOfGenre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTypeOfGenre() {
        return typeOfGenre;
    }

    public void setTypeOfGenre(String typeOfGenre) {
        this.typeOfGenre = typeOfGenre;
    }

    @Override
    void getGenre() {
        System.out.println("Genre: " + this.genre + " type: " + this.typeOfGenre);
    }

    @Override
    void calculateReadingTime() {
        int readingTime = getPages() * 2;
        System.out.println("you will be reading it about "+readingTime+ " minutes");
    }

    @Override
    int getAgeRestriction() {
        return 12;
    }

    @Override
    void getDescription() {
        System.out.println("novel description");
    }
}
