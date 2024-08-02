package tech.auth;

import java.util.HashMap;
import java.util.Map;

public class CommandFactory {
    private static final Map<String, Command> commandMap = new HashMap<>();

    static {
        // Inicializa o mapa com as instâncias de comandos
        commandMap.put("EMAIL", new EmailCommand("exemplo@exemplo.com", "Olá, este é um email!"));
        commandMap.put("SMS", new SmsCommand("123456789", "Olá, este é um SMS!"));
        commandMap.put("WHATSAPP", new WhatsappCommand("987654321", "Olá, esta é uma mensagem do WhatsApp!"));
    }

    public static Command getCommand(String type) {
        Command command = commandMap.get(type.toUpperCase());
        if (command == null) {
            throw new IllegalArgumentException("Invalid message type: " + type);
        }
        return command;
    }
}