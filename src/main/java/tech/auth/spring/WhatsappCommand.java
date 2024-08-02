package tech.auth.spring;

import org.springframework.stereotype.Component;

@Component("WHATSAPP")
public class WhatsappCommand extends Command {

    @Override
    public void execute(String email) {
        System.out.println("Sending WhatsApp message to ");
        // Lógica para enviar mensagem via WhatsApp
    }
}