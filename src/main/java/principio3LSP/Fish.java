package src.main.java.principio3LSP;

public class Fish extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Fish makes blub blub.");
    }

    @Override
    public void display() {
        System.out.println("This is a fish.");
    }
}
