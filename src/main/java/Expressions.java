public interface Expressions {

    Money reduce(Bank bank, String to);
    Expressions plus(Expressions addend);
    Expressions times(int multiplier);
}
