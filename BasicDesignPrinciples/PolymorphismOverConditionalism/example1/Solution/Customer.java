package BasicDesignPrinciples.PolymorphismOverConditionalism.example1.Solution;

/*   
    Customer interface which has logic to print and calculate invoice based on
    customer type

    This Customer class will be used as a reference by Invoice class to 
    calculate and generate invoice based on concrete customer type by calling
    customer type calculateInvoice method
*/
public interface Customer {
    
    public double calculateInvoice(Invoice invoice);

    public void printInvoice(Invoice invoice);
}
