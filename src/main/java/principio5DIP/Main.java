package src.main.java.principio5DIP;

public class Main {
    public static void main(String[] args) {

        PaymentProcessor creditCardProcessor =
                new PaymentProcessor(new CreditCardPayment());
        PaymentProcessor paypalProcessor =
                new PaymentProcessor(new PayPalPayment());
        PaymentProcessor cryptoProcessor =
                new PaymentProcessor(new CryptoPayment());

        creditCardProcessor.makePayment(150.0);
        paypalProcessor.makePayment(200.5);
        cryptoProcessor.makePayment(300.0);
    }
}

