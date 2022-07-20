package SOLIDPrinciples.SingleResponsibilityPrinciple.example1.Solution;

/* 
    InvoicePrinter class whose only task to print invoice 
*/
public class InvoicePrinter {
    
    private Invoice invoice;

    public InvoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }

    // method to print invoice
    public void print() {
        System.out.println("Connecting to HP printer...\n");
        System.out.println("Invoice ID : " + invoice.getInvoiceId());
        System.out.println("Book title : " + this.invoice.getBook().getTitle());
        System.out.println("Quantity : " + this.invoice.getQuantity());
        System.out.println("Per book price : Rs. " + this.invoice.getBook().getPrice());
        System.out.println("Book price after "  + this.invoice.getDiscountRate() + "% discount and " + this.invoice.getGSTRate() + "% GST : Rs. " + this.invoice.getTotalPrice() + "\n");
    }
}
