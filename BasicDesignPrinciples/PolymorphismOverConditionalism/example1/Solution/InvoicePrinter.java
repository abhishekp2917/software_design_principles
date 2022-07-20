package BasicDesignPrinciples.PolymorphismOverConditionalism.example1.Solution;

/* 
    InvoicePrinter class whose task is to print invoice based on Customer type
    by using Customer type object printInvoice method
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
