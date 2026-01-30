package designpatterns.src.decorator;

public class SimpleCoffee implements Coffee {

    @Override
    public String getDescription() {
        return "Your coffee";
    }

    @Override
    public double amount() {
        return 20;
    }

}
