package SOLIDPrinciples.SingleResponsibilityPrinciple.example1.Solution;

/* 
    InvoiceSaver class whose only task to save invoice in database 
*/
public class InvoiceSaver {
    
    private Invoice invoice;

    public InvoiceSaver(Invoice invoice) {
        this.invoice = invoice;
    }

    // method to save invoice in database
    public void save() {
        System.out.println("Connecting to MYSQL Database...\n");
        System.out.println("Saving invoice...");
        System.out.println("Invoice ID : " + invoice.getInvoiceId());
        System.out.println("Book title : " + invoice.getBook().getTitle());
        System.out.println("Quantity : " + invoice.getQuantity());
        System.out.println("Total Price : Rs. " + invoice.getTotalPrice());
        System.out.println("Saved successfully\n");
    }
}
