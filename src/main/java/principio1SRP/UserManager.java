package src.main.java.principio1SRP;
public class UserManager {

    private UserValidator validator;
    private UserRepository repository;
    private EmailService emailService;

    public UserManager() {
        this.validator = new UserValidator();
        this.repository = new UserRepository();
        this.emailService = new EmailService();
    }

    public void addUser(String email, String password) {
        if (validator.isValidEmail(email) && validator.isValidPassword(password)) {
            repository.save(email, password);
            emailService.sendWelcomeEmail(email);
        } else {
            System.out.println("Invalid email or password. User not added.");
        }
    }
}
