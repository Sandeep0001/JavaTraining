package designpatterns.decoratorpattern;

public class SimpleCoffee implements Coffee{
    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public double getCost() {
        return 5.0;
    }
}
