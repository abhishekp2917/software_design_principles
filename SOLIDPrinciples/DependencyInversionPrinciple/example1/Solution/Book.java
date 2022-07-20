package SOLIDPrinciples.DependencyInversionPrinciple.example1.Solution;

/* 
    Book class which will be used to keep in the bookstore and buy from there
*/
public class Book {

    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }
}