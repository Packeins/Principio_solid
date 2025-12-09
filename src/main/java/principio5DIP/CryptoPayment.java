package src.main.java.principio5DIP;

public class CryptoPayment implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Processing Crypto payment of $" + amount);
    }
}
