package tech.auth;

public class Main {
    public static void main(String[] args) {

        CommandFactory.getCommand("EMAIL").execute();
        CommandFactory.getCommand("SMS").execute();
        CommandFactory.getCommand("WHATSAPP").execute();

    }
}