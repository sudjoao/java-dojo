import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Client client = Client.createClient();
        Menu.runMenu(client);
    }
}
