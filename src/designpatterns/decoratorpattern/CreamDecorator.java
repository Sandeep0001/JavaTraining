package designpatterns.decoratorpattern;

public class CreamDecorator extends CoffeeDecorator{

    public CreamDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Cream";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 3.5;//adding cream cost = 3.5
    }
}
