public class Dollar extends Money{

    Dollar(int amount, String currency){
        this.amount = amount;
        this.currency = currency;
    }

    public Money times(int multiplier){
        return new Dollar(amount * multiplier, null);
    }

    public String currency(){
        return currency;
    }
}
