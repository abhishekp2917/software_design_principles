package SOLIDPrinciples.OpenClosedPrinciple.example1.Problem;

/*
    Invoice class which will calculate price to pay and generate invoice

    While this class can print the invoice but logic for printing is implemented 
    by other class and this class use that class to perform

    This Invoice class calculate invoice based on customer type and the method that
    calculate invoice conditionally generate invoice but This way it violates 
    Open Closed principle as if we want to extend the functionality of calculating
    invoice object like adding new customer type then we would end up modifying 
    existing code
*/
public class Invoice {
    
    private static int count;
    private int invoiceId;
    private String customerType;
    private Book book;
    private int quantity;
    private double discountRate;
    private double GSTRate;
    private double totalPrice;
    private InvoicePrinter invoicePrinter;

    public Invoice(String customerType, Book book, int quantity, double discountRate, double GSTRate) {
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

    public String getCustomerType() {
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

    // method to calculate invoice based on customer type
    public double calculateTotalPrice() {
        double price, priceWithGST;
    
        if (this.customerType=="Silver") {
            double extraDiscount = 5.0;

            price = (book.getPrice()-book.getPrice()*(this.discountRate+extraDiscount)/100)*this.quantity;
            priceWithGST = price*(1+this.GSTRate/100);
            return priceWithGST;
        }
        else {

            price = (book.getPrice()-book.getPrice()*this.discountRate/100)*this.quantity;
            priceWithGST = price*(1+this.GSTRate/100);
            return priceWithGST;
        }
    }

    // method to print invoice
    public void printInvoice() {
        // using InvoicePrinter object to print invoice
        this.invoicePrinter.print();
    }
}
