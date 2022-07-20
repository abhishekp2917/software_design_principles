package SOLIDPrinciples.OpenClosedPrinciple.example1.Problem;

public class Client1 {
    
    public static void main(String[] args) {
        // creating book objects
        Book harryPotterNovel = new Book("Harry Potter-The ring of fire", "Jenny ketler", 2018, 960.5);

        // creating invoice for normal customer
        Invoice firstInvoice = new Invoice("Normal", harryPotterNovel, 2, 10.0, 5.0);
        // creating invoice for silver card holding customer
        Invoice secondInvoice = new Invoice("Silver", harryPotterNovel, 2, 10.0, 5.0);

        System.out.println("\n_______________Printing first Invoice_____________\n");
        firstInvoice.printInvoice();

        System.out.println("\n_______________Printing second Invoice_____________\n");
        secondInvoice.printInvoice();
    }
}
