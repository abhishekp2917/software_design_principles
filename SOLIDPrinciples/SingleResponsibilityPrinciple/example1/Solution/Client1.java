package SOLIDPrinciples.SingleResponsibilityPrinciple.example1.Solution;

public class Client1 {
    
    public static void main(String[] args) {
        
        // creating book objects
        Book harryPotterNovel = new Book("Harry Potter-The ring of fire", "Jenny ketler", 2018, 960.5);
        Book ramayan = new Book("Ramayan", "Tulsi Das", 600, 1060.0);

        // creating invoice for books 
        Invoice firstInvoice = new Invoice(harryPotterNovel, 2, 10.0, 5.0);
        Invoice secondInvoice = new Invoice(ramayan, 10, 20.0, 2.0);

        System.out.println("\n_______________Printing and Saving first Invoice_____________\n");
        firstInvoice.printInvoice();
        firstInvoice.saveInvoice();

        System.out.println("\n_______________Printing and Saving second Invoice_____________\n");
        secondInvoice.printInvoice();
        secondInvoice.saveInvoice();
    }
}
