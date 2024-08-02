package tech.auth.spring;

import org.springframework.stereotype.Component;

@Component("EMAIL")
public class EmailCommand extends Command {

    @Override
    public void execute(String email) {
        System.out.println("Sending Email to ");
    }
}
