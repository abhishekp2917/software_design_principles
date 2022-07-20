package BasicDesignPrinciples.PolymorphismOverConditionalism.example1.Solution;

/*
    Invoice class which will calculate price to pay and generate invoice

    While this class can print the invoice but logic for printing is implemented 
    by other class and this class use that class to perform

    This Invoice class instead of calculating invoice using if-else inside 
    calculate invoice class it will calculate invoice based on Customer type object 
    passed as an argument and the method that calculate invoice uses that Customer 
    type object to get implementation logic and calculate invoice
*/
public class Invoice {
    
    private static int count;
    private int invoiceId;
    private Customer customerType;
    private Book book;
    private int quantity;
    private double discountRate;
    private double GSTRate;
    private double totalPrice;
    private InvoicePrinter invoicePrinter;

    public Invoice(Customer customerType, Book book, int quantity, double discountRate, double GSTRate) {
        this.customerType = customerType;
        this.book = book;
        this.quantity = quantity;
        this.discountRate = discountRate;
        this.GSTRate = GSTRate;
        this.invoicePrinter = new InvoicePrinter(this); 
        this.totalPrice = this.calculateTotalPrice();
        Invoice.count++;
        this.invoiceId = Invoice.count;
    }

    public int getInvoiceId() {
        return this.invoiceId;
    }

    public Customer getCustomerType() {
        return customerType;
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

    // method to calculate invoice based on Customer type object and using its method
    public double calculateTotalPrice() {
        // using Customer type object to get logic for calculating invoice
        return customerType.calculateInvoice(this);
    }

    // method to print invoice
    public void printInvoice() {
        // using InvoicePrinter object to print invoice
        this.invoicePrinter.print();
    }
}
