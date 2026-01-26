package designpatterns.src.strategy;

public class UpiPayment implements IpaymentMethodProvider {
    private String vpa;

    public String getVpa() {
        return vpa;
    }

    public void setVpa(String vpa) {
        this.vpa = vpa;
    }

    @Override
    public void pay(double amount) {
        System.out.println("calling upi payment pay method for upi vpa " + this.vpa);
        // UPI specific validations
        System.out.println("payment of amount" + amount + " completed");
    }

}
