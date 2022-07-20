package SOLIDPrinciples.DependencyInversionPrinciple.example1.Solution;

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
        MasterCard idfcCard = new MasterCard("Abhishek", "1234-5678-1122", 1234, 10_000.0, masterCardPaymentGateway);

        // creating visa card payment gateway
        VisaPayment visaPaymentGateway = new VisaPayment();

        // creating visa card to purchase books
        VisaCard sbiCard = new VisaCard("Abhishek", "444-555-666", 1234, 10_000.0, visaPaymentGateway);

        System.out.println("\n_______Purchasing books using MasterCard__________\n");
        amazonBookStore.purchaseBooks("Ramayan", 2, idfcCard);

        System.out.println("\n_______Purchasing books using VisaCard________\n");
        amazonBookStore.purchaseBooks("Mahabharat", 2, sbiCard);
    }
}