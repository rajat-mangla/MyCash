public class Bank {

    public Money reduce(Expressions source, String to){
        Sum sum = (Sum) source;
        return sum.reduce(to);
    }
}
