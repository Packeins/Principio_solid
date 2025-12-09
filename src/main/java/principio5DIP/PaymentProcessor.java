package src.main.java.principio5DIP;

public class PaymentProcessor {

    private final PaymentMethod method;

    public PaymentProcessor(PaymentMethod method) {
        this.method = method;
    }

    public void makePayment(double amount) {
        method.pay(amount);
    }
}
