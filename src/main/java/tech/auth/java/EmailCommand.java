package tech.auth.java;

public class EmailCommand implements Command {

    private final String emailAddress;
    private final String message;

    public EmailCommand(String emailAddress, String message) {
        this.emailAddress = emailAddress;
        this.message = message;
    }

    @Override
    public void execute() {
        System.out.println("Sending Email to " + emailAddress + ": " + message);
    }
}
