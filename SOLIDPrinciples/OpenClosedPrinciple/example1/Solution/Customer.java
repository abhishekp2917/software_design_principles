package SOLIDPrinciples.OpenClosedPrinciple.example1.Solution;

/*   
    Customer interface which has logic to print and calculate invoice based on
    customer type
*/
public interface Customer {
    
    public double calculateInvoice(Invoice invoice);

    public void printInvoice(Invoice invoice);
}
