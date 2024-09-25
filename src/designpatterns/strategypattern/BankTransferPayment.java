package designpatterns.strategypattern;

public class BankTransferPayment implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("making the payment of " + amount + " using bank transfer");
    }
}
