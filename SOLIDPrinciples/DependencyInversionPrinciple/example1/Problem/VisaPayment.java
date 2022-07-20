package SOLIDPrinciples.DependencyInversionPrinciple.example1.Problem;

/* 
    VisaPayment class used by visaCard ton carry out transaction using
    visaCard
*/
public class VisaPayment {

    // method to pay using visa card payment gateway
    public void pay(double amount, VisaCard card) {
        System.out.println("Connecting to Visa payment gateway...");
        System.out.println("Validating credentials...");
        System.out.println("Card Owner : " + card.getName());
        System.out.println("Card Number : " + card.getCardNumber());
        if(card.getBalance()>=amount) {
            card.setBalance(card.getBalance()-amount);
            System.out.println("Payment of Rs." + amount + " successfull");
        }
        else {
            System.out.println("Payment failed");
        }
    }
}
