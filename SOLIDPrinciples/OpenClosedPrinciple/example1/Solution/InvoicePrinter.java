package SOLIDPrinciples.OpenClosedPrinciple.example1.Solution;

/* 
    InvoicePrinter class whose task is to print invoice based on customer type
*/
public class InvoicePrinter {
    
    private Invoice invoice;

    public InvoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }

    // method to print invoice
    public void print() {
        // using Customer type object to get implementation for printing invoice 
        invoice.getCustomerType().printInvoice(invoice);
    }
}
