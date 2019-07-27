public class Sum implements Expressions {
    Money augend;
    Money addend;

    public Sum(Money addend, Money augend) {
        this.addend = addend;
        this.augend = augend;
    }
}
