package SOLIDPrinciples.DependencyInversionPrinciple.example1.Solution;

/* 
    MasterCardPayment class used by masterCard ton carry out transaction using
    masterCard
*/
public class MasterCardPayment {
    
    // method to pay using master card payment gateway
    public void pay(double amount, MasterCard card) {
        System.out.println("Connecting to MasterCard payment gateway...");
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
