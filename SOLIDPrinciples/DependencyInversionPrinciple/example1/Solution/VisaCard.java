package SOLIDPrinciples.DependencyInversionPrinciple.example1.Solution;

/* 
    VisaCard implements PaymentCard interface which can be used to pay for 
    buying books form bookstore
*/
public class VisaCard implements PaymentCard {
    
    private String name;
    private String cardNumber;
    private int PINCode;
    private double balance;
    private VisaPayment visaPaymentGateway;

    public VisaCard(String name, String cardNumber, int PINCode, double balance, VisaPayment visaPaymentGateway) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.PINCode = PINCode;
        this.balance = balance;
        this.visaPaymentGateway = visaPaymentGateway;
    }

    public String getName() {
        return name;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public int getPINCode() {
        return PINCode;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // method to pay amount
    public void pay(double amount) {
        // using masterCard payment gateway to carry out transaction using visaCard
        this.visaPaymentGateway.pay(amount, this);
    }
}
