package challenge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Account {
    private final double cardLimit;
    private final List<Transaction> transactions;

    public Account(double cardLimit) {
        this.cardLimit = cardLimit;
        this.transactions = new ArrayList<>();
    }

    public double getCardLimit() {
        return cardLimit;
    }

    public List<Transaction> getTransactions() {
        return new ArrayList<>(transactions);
    }

    public void addTransaction(Transaction transaction){
        if(totalSpent()+transaction.getPrice() > cardLimit){
            System.out.println("Compra excede limite do cartão.");
            return;
        }
        transactions.add(transaction);
    }

    public String info(){
        return "Sua conta com o cartão de limite total de %.2f possui %d transações que totalizam R$ %.2f.\nO limite atual do cartão é: R$ %.2f\n.".formatted(cardLimit, transactions.size(), totalSpent(), cardLimit - totalSpent());
    }

    public double totalSpent() {
        return transactions.stream().mapToDouble(Transaction::getPrice).sum();
    }

    public List<Transaction> getNameOrderedTransactions() {
        return transactions.stream()
                .sorted(Comparator.comparing(Transaction::getName))
                .toList();
    }

    public List<Transaction> getPriceOrderedTransactions() {
        return transactions.stream()
                .sorted(Comparator.comparing(Transaction::getPrice))
                .toList();
    }

}

