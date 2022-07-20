package BasicDesignPrinciples.PolymorphismOverConditionalism.example1.Solution;

/* 
    SilverCardCustomer whose task is to calculate invoice and print invoice for 
    customer having silver card membership
*/
public class SilverCardCustomer implements Customer {
    
    private double extraDiscount;
    
    public SilverCardCustomer(double extraDiscount) {
        this.extraDiscount = extraDiscount;
    }
    
    // method to calculate invoice for silver card holder
    @Override
    public double calculateInvoice(Invoice invoice) {
        double price, priceWithGST, totalDiscount = invoice.getDiscountRate()+this.extraDiscount;
        price = (invoice.getBook().getPrice()-invoice.getBook().getPrice()*(totalDiscount)/100)*invoice.getQuantity();
        priceWithGST = price*(1+invoice.getGSTRate()/100);
        return priceWithGST;
    }

    // method to print invoice for silver card holder
    @Override
    public void printInvoice(Invoice invoice) {
        System.out.println("Connecting to HP printer...\n");
        System.out.println("Invoice ID : " + invoice.getInvoiceId());
        System.out.println("Customer type : " + invoice.getCustomerType());
        System.out.println("Book title : " + invoice.getBook().getTitle());
        System.out.println("Quantity : " + invoice.getQuantity());
        System.out.println("Per book price : Rs. " + invoice.getBook().getPrice());
        System.out.println("Extra discount for Silver card holder : " + this.extraDiscount + "%");
        System.out.println("Book price after "  + invoice.getDiscountRate() + "% discount, " + this.extraDiscount + " extra discount and " + invoice.getGSTRate() + "% GST : Rs. " + invoice.getTotalPrice() + "\n");
    }
}
