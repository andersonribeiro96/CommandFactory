package tech.auth.java;

public class WhatsappCommand implements Command {
    private final String whatsappNumber;
    private final String message;

    public WhatsappCommand(String whatsappNumber, String message) {
        this.whatsappNumber = whatsappNumber;
        this.message = message;
    }

    @Override
    public void execute() {
        System.out.println("Sending WhatsApp message to " + whatsappNumber + ": " + message);
        // Lógica para enviar mensagem via WhatsApp
    }
}