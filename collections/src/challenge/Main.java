package challenge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo ao sistema de banco, para iniciar digite o limite do seu cartão:");
        double cardLimit = scanner.nextDouble();
        Account account = new Account(cardLimit);
        int option = -1;

        while(option != 4){
            System.out.println(account.info());
            System.out.println("Qual operação você deseja fazer?\n1. Visualizar transações ordenadas por preço\n2. Visualizar transações ordenadas por nome\n3. Adicionar nova transação\n4. Sair");
            option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    System.out.println(account.getPriceOrderedTransactions());
                    break;
                case 2:
                    System.out.println(account.getNameOrderedTransactions());
                    break;
                case 3:
                    System.out.println("Digite o nome da transação");
                    String name = scanner.nextLine();
                    System.out.println("Digite o valor da transação");
                    double value = scanner.nextDouble();
                    account.addTransaction(new Transaction(name, value));
                case 4:
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}
