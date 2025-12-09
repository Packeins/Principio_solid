package src.main.java.principio2OCP;

public class PushNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending Push Notification: " + message);
    }
}
