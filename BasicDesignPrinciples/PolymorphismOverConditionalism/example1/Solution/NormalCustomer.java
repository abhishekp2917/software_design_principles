package BasicDesignPrinciples.PolymorphismOverConditionalism.example1.Solution;

/* 
    NormalCustomer whose task is to calculate invoice and print invoice for 
    normal customer who doesn't have any membership card
*/
public class NormalCustomer implements Customer {

    // method to calculate invoice for normal customer
    @Override
    public double calculateInvoice(Invoice invoice) {
        double price, priceWithGST;
        price = (invoice.getBook().getPrice()-invoice.getBook().getPrice()*invoice.getDiscountRate()/100)*invoice.getQuantity();
        priceWithGST = price*(1+invoice.getGSTRate()/100);
        return priceWithGST;
    }

    // method to printing invoice for normal customer
    @Override
    public void printInvoice(Invoice invoice) {
        System.out.println("Connecting to HP printer...\n");
            System.out.println("Invoice ID : " + invoice.getInvoiceId());
            System.out.println("Customer type : " + invoice.getCustomerType());
            System.out.println("Book title : " + invoice.getBook().getTitle());
            System.out.println("Quantity : " + invoice.getQuantity());
            System.out.println("Per book price : Rs. " + invoice.getBook().getPrice());
            System.out.println("Book price after "  + invoice.getDiscountRate() + "% discount and " + invoice.getGSTRate() + "% GST : Rs. " + invoice.getTotalPrice() + "\n");
    }
}
