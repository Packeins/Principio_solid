package src.main.java.principio4ISP;

public class Main {
    public static void main(String[] args) {

        Powerable phone = new PhoneFixed();
        Powerable camera = new DisposableCameraFixed();

        phone.turnOn();
        ((Rechargeable) phone).charge();  // OK

        camera.turnOn();
        camera.turnOff();                 // No intenta cargarse
    }
}
