package designpatterns.src.strategy;

public class PaymentCheckout {
    private IpaymentMethodProvider ipaymentMethodProvider;

    public PaymentCheckout(IpaymentMethodProvider ipaymentMethodProvider) {
        this.ipaymentMethodProvider = ipaymentMethodProvider;
    }

    public void doPayment(double amount) {
        this.ipaymentMethodProvider.pay(amount);
    }
}
