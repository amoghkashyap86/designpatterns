package designpatterns.src.strategy;

public class Main {
    public static void main(String[] args) {
        PaymentCheckout paymentCheckout = new PaymentCheckout(new CardPayment("xxxx-xxxx-xxxx-xxx"));

        paymentCheckout.doPayment(3400);
    }
}
