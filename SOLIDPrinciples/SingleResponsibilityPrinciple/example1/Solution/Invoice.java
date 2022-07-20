package SOLIDPrinciples.SingleResponsibilityPrinciple.example1.Solution;

/*
    Invoice class which will calculate price to pay and generate invoice

    While this class can print and save the invoice but logic for printing and 
    saving is implemented by other class and this class use that class to perform
    those operation

    This way it follows SRP 
*/
public class Invoice {
    
    private static int count;
    private int invoiceId;
    private Book book;
    private int quantity;
    private double discountRate;
    private double GSTRate;
    private double totalPrice;
    private InvoicePrinter invoicePrinter;
    private InvoiceSaver invoiceSaver;

    public Invoice(Book book, int quantity, double discountRate, double GSTRate) {
        this.book = book;
        this.quantity = quantity;
        this.discountRate = discountRate;
        this.GSTRate = GSTRate;
        this.invoicePrinter = new InvoicePrinter(this); 
        this.invoiceSaver = new InvoiceSaver(this);
        this.totalPrice = this.calculateTotalPrice();
        Invoice.count++;
        this.invoiceId = Invoice.count;
    }

    public int getInvoiceId() {
        return this.invoiceId;
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
    public double calculateTotalPrice() {
        double price = (book.getPrice()-book.getPrice()*this.discountRate/100)*this.quantity;
        double priceWithGST = price*(1+this.GSTRate/100);
        return priceWithGST;
    }

    // method to print invoice 
    public void printInvoice() {
        // using InvoicePrinter object to print invoice
        this.invoicePrinter.print();
    }

    // method to save invoice 
    public void saveInvoice() {
        // using InvoiceSaver object to save invoice
        this.invoiceSaver.save();
    }
}
