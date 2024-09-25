package designpatterns.strategypattern;

public class PaymentTest {

    public static void main(String[] args) {

        PaymentContext context = new PaymentContext(new CreditCardPayment());

        context.pay(120.89); //making the payment of 120.89 using credit card

        context.setPaymentStrategy(new PaypalPayment());
        context.pay(500.11); //making the payment of 500.11 using paypal

        context.setPaymentStrategy(new BankTransferPayment());
        context.pay(2000.34); //making the payment of 2000.34 using bank transfer
    }
}
