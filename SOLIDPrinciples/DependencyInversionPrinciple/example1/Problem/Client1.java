package SOLIDPrinciples.DependencyInversionPrinciple.example1.Problem;

public class Client1 {

    public static void main(String[] args) {
        
        // creating book store
        BookStore amazonBookStore = new BookStore();

        // adding books in bookstore
        amazonBookStore.addBook(new Book("Ramayan", "Valimiki", 2050.7));
        amazonBookStore.addBook(new Book("Mahabharat", "Vayas", 2050.7));

        // creating mastercard payment gateway
        MasterCardPayment masterCardPaymentGateway = new MasterCardPayment();

        // creating mastercard to purchase books
        MasterCard idfcCard = new MasterCard("Abhishek", "12345678", 1234, 10_000.0, masterCardPaymentGateway);

        // purchasing books using master card but we can't purchase using visa card
        amazonBookStore.purchaseBooks("Ramayan", 2, idfcCard);
    }
}