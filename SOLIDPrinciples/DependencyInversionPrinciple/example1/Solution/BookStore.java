package SOLIDPrinciples.DependencyInversionPrinciple.example1.Solution;

import java.util.HashMap;

/* 
    BookStore which will have books which can be purchased by the cutomer

    To purchase books, bookstore currently receives any card which implements 
    PaymentCard interface and by using this we make the system loosely coupled 
    and thus if in future we want to receive any card we don't need to change the
    existing code
    
    Here high level class i.e. BookStore depends upon abstraction i.e. PaymentCard and 
    thus follows Dependency inversion principle 
*/
public class BookStore {

    private HashMap<String, Book> books = new HashMap<>();

    public HashMap<String, Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
        this.books.put(book.getName(),book);
    }

    // method to calculate books price that is to pay
    public double calculateTotalPrice(Book book, int quantity) {
        double totalPrice = book.getPrice()*quantity;
        return totalPrice;
    }

    // method to purchase books which receives any paymentCard whether it is mastercard or visa
    public void purchaseBooks(String bookName, int quantity, PaymentCard paymentCard) {
        double amount = this.calculateTotalPrice(this.books.get(bookName), quantity);
        paymentCard.pay(amount);
    }
}
