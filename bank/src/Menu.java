import java.util.Scanner;

public class Menu {
    public static void runMenu(Client client){
        Scanner scanner = new Scanner(System.in);
        int option = -1;
        while(option != 4){
            System.out.println("Digite a operação que quer realizar:\n1. Consultar dados\n2. Receber valor\n3. Transferir valor\n4. Sair");
            option = scanner.nextInt();

            if(option == 1){
                client.showData();
            } else if(option == 2){
                System.out.println("Digite o valor que quer depositar");
                double value = scanner.nextDouble();
                client.increaseBalance(value);
            } else if(option == 3){
                System.out.println("Digite o valor que quer transferir");
                double value = scanner.nextDouble();
                client.decreaseBalance(value);
            }
        }
    }
}
