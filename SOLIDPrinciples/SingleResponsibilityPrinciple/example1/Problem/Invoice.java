package SOLIDPrinciples.SingleResponsibilityPrinciple.example1.Problem;

/*
    Invoice class which will calculate price to pay and generate invoice, print invoice
    and save invoice 
    
    Here Invoice class is doing more than one task and thus violating SRP and is we 
    want to change the logic for any of these three method we would have to change this
    class 
*/
public class Invoice {
    
    private static int count;
    private int invoiceId;
    private Book book;
    private int quantity;
    private double discountRate;
    private double GSTRate;
    private double totalPrice;

    public Invoice(Book book, int quantity, double discountRate, double GSTRate) {
        this.book = book;
        this.quantity = quantity;
        this.discountRate = discountRate;
        this.GSTRate = GSTRate;
        this.totalPrice = this.calculateTotalPrice();
        Invoice.count++;
        this.invoiceId = Invoice.count;
    }

    public int getInvoiceId() {
        return invoiceId;
    }

    public Book getBook() {
        return book;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public double getGSTRate() {
        return GSTRate;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    // method to calculate total price after GST and discount and generate invoice
    private double calculateTotalPrice() {
        double price = (book.getPrice()-book.getPrice()*this.discountRate/100)*this.quantity;
        double priceWithGST = price*(1+this.GSTRate/100);
        return priceWithGST;
    }

    // method to print invoice
    public void printInvoice() {
        System.out.println("Connecting to HP printer...\n");
        System.out.println("Invoice ID : " + this.getInvoiceId());
        System.out.println("Book title : " + this.getBook().getTitle());
        System.out.println("Quantity : " + this.getQuantity());
        System.out.println("Per book price : Rs. " + this.getBook().getPrice());
        System.out.println("Book price after discount and GST : Rs. " + this.getTotalPrice() + "\n");
    }

    // method to save invoice in mysql database
    public void saveInvoice() {
        System.out.println("Connecting to MYSQL Database...\n");
        System.out.println("Saving invoice...");
        System.out.println("Invoice ID : " + this.getInvoiceId());
        System.out.println("Book title : " + this.getBook().getTitle());
        System.out.println("Quantity : " + this.getQuantity());
        System.out.println("Total Price : Rs. " + this.getTotalPrice());
        System.out.println("Saved successfully\n");
    }

}
