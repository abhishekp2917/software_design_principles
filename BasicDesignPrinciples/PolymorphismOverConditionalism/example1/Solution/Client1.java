package BasicDesignPrinciples.PolymorphismOverConditionalism.example1.Solution;

public class Client1 {
    
    public static void main(String[] args) {
        
        // creating book objects
        Book harryPotterNovel = new Book("Harry Potter-The ring of fire", "Jenny ketler", 2018, 960.5);

        // creating invoice for normal customer
        Invoice firstInvoice = new Invoice(new NormalCustomer(), harryPotterNovel, 2, 10.0, 5.0);
        // creating invoice for silver card holding customer
        Invoice secondInvoice = new Invoice(new SilverCardCustomer(5.0), harryPotterNovel, 2, 10.0, 5.0);
        // creating invoice for gold card holding customer
        Invoice thirdInvoice = new Invoice(new GoldCardCustomer(15.0), harryPotterNovel, 2, 10.0, 5.0);


        System.out.println("\n_______________Printing first Invoice_____________\n");
        firstInvoice.printInvoice();

        System.out.println("\n_______________Printing second Invoice_____________\n");
        secondInvoice.printInvoice();

        System.out.println("\n_______________Printing third Invoice_____________\n");
        thirdInvoice.printInvoice();
    }
}
