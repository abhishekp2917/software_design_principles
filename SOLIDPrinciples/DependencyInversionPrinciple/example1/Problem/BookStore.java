package SOLIDPrinciples.DependencyInversionPrinciple.example1.Problem;

import java.util.HashMap;

/* 
    BookStore which will have books which can be purchased by the cutomer

    To purchase books, bookstore currently receives masterCard only and by
    using masterCard concrete class we tightly coupled the bookstore with masterCard
    class

    If in future we want to add any other card then we'd have to change this class
    which violates open closed principle as well as dependency inversion principle
    
    Here high level class i.e. BookStore depends upon low level class MasterCard. 
    Instead of this, both class should depend upon abstraction
*/
public class BookStore {

    private HashMap<String, Book> books = new HashMap<>();

    public HashMap<String, Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
        this.books.put(book.getName(),book);
    }

    public double calculateTotalPrice(Book book, int quantity) {
        double totalPrice = book.getPrice()*quantity;
        return totalPrice;
    }

    // method to purchase books which receives masterCard only
    public void purchaseBooks(String bookName, int quantity, MasterCard masterCard) {
        double amount = this.calculateTotalPrice(this.books.get(bookName), quantity);
        masterCard.pay(amount);
    }
}
