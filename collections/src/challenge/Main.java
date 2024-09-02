package challenge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo ao sistema de banco, para iniciar digite o limite do seu cartão:");
        double cardLimit = scanner.nextDouble();
        Account account = new Account(cardLimit);
        int option = -1;

        while(option != 3){
            System.out.println(account.info());
            System.out.println("Qual operação você deseja fazer?\n1. Visualizar transações\n2. Adicionar nova transação\n3. Sair");
            option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    System.out.println(account.getTransactions());
                    break;
                case 2:
                    System.out.println("Digite o nome da transação");
                    String name = scanner.nextLine();
                    System.out.println("Digite o valor da transação");
                    double value = scanner.nextDouble();
                    account.addTransaction(new Transaction(name, value));
                case 3:
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}
