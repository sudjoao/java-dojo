import java.util.Scanner;

public class Client {
    public String name;
    public String accountType;
    private double balance;

    public Client(String name, int accountType, double balance) {
        this.name = name;
        this.accountType = Client.getAccount(accountType);
        this.balance = balance;
    }

    void setBalance(double balance) {
        if (balance > 0)
            this.balance = balance;
    }

    double getBalance() {
        return this.balance;
    }

    void increaseBalance(double value) {
        setBalance(value + balance);
        System.out.printf("Saldo atualizado: R$ %f\n", balance);
    }

    void decreaseBalance(double value) {
        if (balance - value > 0) {
            setBalance(value + balance);
            System.out.printf("Saldo atualizado: R$ %f", balance);
        } else {
            System.out.println("Não há saldo suficiente para fazer essa transferência.");
        }
    }

    void showData() {
        System.out.printf("Os dados do seu cliente são:\n%s", this);
    }

    static String getAccount(int account) {
        if (account == 0)
            return "Conta corrente";
        return "Conta poupança";
    }

    static Client createClient() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo ao sistema do banco, vamos cadastrar seu usuário");
        System.out.println("Digite o nome do seu usuário");
        String name = scanner.nextLine();
        System.out.println("Escolha o tipo da conta do seu usuário: \n1. Conta corrente\n2. Conta poupança");
        int account = scanner.nextInt();
        while (account < 1 || account > 2) {
            System.out.println("Opção não identificada.\nEscolha o tipo da conta do seu usuário: \n1. Conta corrente\n2. Conta poupança");
            account = scanner.nextInt();
        }
        System.out.println("Digite o saldo inicial do usuário");
        double balance = scanner.nextDouble();
        while (balance < 0) {
            System.out.println("O saldo precisa ser positivo.\nDigite o saldo novamente");
            balance = scanner.nextDouble();
        }
        Client client = new Client(name, account, balance);
        System.out.print("Cliente cadastrado com sucesso.");
        client.showData();
        return client;
    }

    @Override
    public String toString() {
        return "Nome: %s\nTipo de conta:%s\nSaldo atual: R$ %f".formatted(name, accountType, balance);
    }
}
