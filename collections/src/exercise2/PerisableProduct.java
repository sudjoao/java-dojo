package exercise2;

public class PerisableProduct extends Product {
    private int dueYear;
    public PerisableProduct(int dueYear, String name, double price) {
        super(name, price);
        this.dueYear = dueYear;
    }

    @Override
    public String toString() {
        return super.toString() + " valid until %d".formatted(dueYear);
    }
}
