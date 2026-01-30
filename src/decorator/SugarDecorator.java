package designpatterns.src.decorator;

public class SugarDecorator extends CoffeeDecorator {

    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + "with sugar";
    }

    @Override
    public double amount() {
        return 0;
    }

}
