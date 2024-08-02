package tech.auth.spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class CommandService implements CommandLineRunner {

    private final Map<String, Command> commandMap;

    public CommandService(Map<String, Command> commandMap) {
        this.commandMap = commandMap;
    }

    @Override
    public void run(String... args) throws Exception {
        Command sms = commandMap.get("SMS");
        sms.execute("anderson_ribeiro@");
        System.exit(0);
    }
}
