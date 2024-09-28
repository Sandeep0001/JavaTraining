package designpatterns.decoratorpattern;

public class Customer {

    public static void main(String[] args) {

        //Simple coffee
        Coffee myCoffee = new SimpleCoffee();
        System.out.println(myCoffee.getDescription() + " $" + myCoffee.getCost()); //Simple Coffee $5.0

        //add extra milk
        myCoffee = new MilkDecorator(myCoffee);
        System.out.println(myCoffee.getDescription() + " $" + myCoffee.getCost()); //Simple Coffee, Milk $6.50

        //add extra sugar
        myCoffee = new SugarDecorator(myCoffee);
        System.out.println(myCoffee.getDescription() + " $" + myCoffee.getCost()); //Simple Coffee, Milk, Sugar $7.0

        //add extra cream
        myCoffee = new CreamDecorator(myCoffee);
        System.out.println(myCoffee.getDescription() + " $" + myCoffee.getCost()); //Simple Coffee, Milk, Sugar, Cream $10.5

        System.out.println("Final cost: $" + myCoffee.getCost()); //Final cost: $10.5
    }
}
