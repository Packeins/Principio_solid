package src.main.java.principio5DIP;

public class CreditCardPayment implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}