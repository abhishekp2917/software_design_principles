package SOLIDPrinciples.OpenClosedPrinciple.example1.Solution;

/* 
    Book class which will be used to buy and generate invoice
*/
public class Book {

    private String title;
    private String author;
    private int publishingYear;
    private double price;

    public Book(String title, String author, int publishingYear, double price) {
        this.title = title;
        this.author = author;
        this.publishingYear = publishingYear;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}