package src.main.java.principio2OCP;

public class NotificationService {

    public void send(Notification notification, String message) {
        notification.send(message);
    }
}