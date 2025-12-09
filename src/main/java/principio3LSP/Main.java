package src.main.java.principio3LSP;

public class Main {
    public static void main(String[] args) {

        Animal dog = new Dog();
        Animal fish = new Fish();

        System.out.println("--- Dog ---");
        dog.display();
        dog.makeSound();
        ((Dog) dog).walk(); // porque implementa Walkable

        System.out.println("\n--- Fish ---");
        fish.display();
        fish.makeSound();
        // NO se llama walk() → no existe → se cumple LSP
    }
}
