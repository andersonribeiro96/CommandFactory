package tech.auth.spring;

import org.springframework.stereotype.Component;

@Component("SMS")
public class SmsCommand extends Command {


    @Override
    public void execute(String email) {
        System.out.println("Sending SMS to ");
    }
}