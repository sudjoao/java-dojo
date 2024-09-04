package exercise1;

public class Grade {
    private final Subject subject;
    private final double value;

    public Grade(Subject subject, double value) {
        this.subject = subject;
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public Subject getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return "%s: %.2f".formatted(subject, value);
    }
}
