package designpatterns.src.decorator;

public class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return this.coffee.getDescription() + " with milk";
    }

    @Override
    public double amount() {
        return this.coffee.amount() + 20;
    }

}
