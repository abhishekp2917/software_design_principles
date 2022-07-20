package SOLIDPrinciples.OpenClosedPrinciple.example1.Problem;

/* 
    InvoicePrinter class whose only task to print invoice 

    It prints invoice conditionally based on customer type and thus violates
    open closed principle
*/
public class InvoicePrinter {
    
    private Invoice invoice;

    public InvoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }

    // method to print invoice based on cutomer type
    public void print() {
        if(invoice.getCustomerType()=="Silver") {
            System.out.println("Connecting to HP printer...\n");
            System.out.println("Invoice ID : " + invoice.getInvoiceId());
            System.out.println("Customer type : " + invoice.getCustomerType());
            System.out.println("Book title : " + this.invoice.getBook().getTitle());
            System.out.println("Quantity : " + this.invoice.getQuantity());
            System.out.println("Per book price : Rs. " + this.invoice.getBook().getPrice());
            System.out.println("Extra discount for Silver card holder : 5.0%");
            System.out.println("Book price after "  + this.invoice.getDiscountRate() + "% discount, 5.0% extra discount and " + this.invoice.getGSTRate() + "% GST : Rs. " + this.invoice.getTotalPrice() + "\n");
        }
        else {
            System.out.println("Connecting to HP printer...\n");
            System.out.println("Invoice ID : " + invoice.getInvoiceId());
            System.out.println("Customer type : " + invoice.getCustomerType());
            System.out.println("Book title : " + this.invoice.getBook().getTitle());
            System.out.println("Quantity : " + this.invoice.getQuantity());
            System.out.println("Per book price : Rs. " + this.invoice.getBook().getPrice());
            System.out.println("Book price after "  + this.invoice.getDiscountRate() + "% discount and " + this.invoice.getGSTRate() + "% GST : Rs. " + this.invoice.getTotalPrice() + "\n");
        }
    }
}
