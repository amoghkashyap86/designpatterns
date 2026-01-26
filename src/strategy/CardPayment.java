package designpatterns.src.strategy;

public class CardPayment implements IpaymentMethodProvider {

    private String cardNumber;

    public CardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("calling card payment pay method for card number " + this.cardNumber);
        // card specific validations
        System.out.println("payment of amount" + amount + " completed");
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

}
