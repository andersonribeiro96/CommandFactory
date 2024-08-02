package tech.auth;

public class SmsCommand implements Command {
    private final String phoneNumber;
    private final String message;

    public SmsCommand(String phoneNumber, String message) {
        this.phoneNumber = phoneNumber;
        this.message = message;
    }

    @Override
    public void execute() {
        System.out.println("Sending SMS to " + phoneNumber + ": " + message);
    }
}