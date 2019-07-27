public class Sum implements Expressions {
    Expressions augend;
    Expressions addend;

    public Sum(Expressions addend, Expressions augend) {
        this.addend = addend;
        this.augend = augend;
    }

    public Money reduce(Bank bank, String to){
        int amount = augend.reduce(bank, to ).amount + addend.reduce(bank, to).amount;
        return new Money(amount, to);
    }

    public Expressions plus(Expressions addend){
        return new Sum(this, addend);
    }
}
