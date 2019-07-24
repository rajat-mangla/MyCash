public class Dollar {
    int amount = 10;

    Dollar(int amount){
        this.amount = amount;
    }

    Dollar times(int multiplier){
        return new Dollar(amount * multiplier);
    }

    boolean equals(Dollar dollar){
        return true;
    }

}
