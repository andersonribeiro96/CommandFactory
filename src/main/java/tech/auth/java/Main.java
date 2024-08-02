package tech.auth.java;

public class Main {
    public static void main(String[] args) {

        CommandFactory.getCommand("EMAIL").execute();
        CommandFactory.getCommand("SMS").execute();
        CommandFactory.getCommand("WHATSAPP").execute();

    }
}