package src.main.java.principio2OCP;

public class Main {
    public static void main(String[] args) {

        NotificationService service = new NotificationService();

        Notification email = new EmailNotification();
        Notification sms = new SMSNotification();
        Notification push = new PushNotification();

        service.send(email, "Hello via Email!");
        service.send(sms, "Hello via SMS!");
        service.send(push, "Hello via Push Notification!");

        // New notification type? → solo implementas Notification
        // SIN tocar NotificationService
    }
}