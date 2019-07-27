import org.junit.Assert;
import org.junit.Test;

public class SumTest {

    @Test
    public void testSumPlusMoney(){
        Expressions fiveBucks = Money.dollar(5);
        Expressions fiveFrancs= Money.franc(10);
        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);
        Expressions sum = new Sum(fiveBucks, fiveFrancs).plus(fiveBucks);
        Money result = bank.reduce(sum, "USD");
        Assert.assertEquals(Money.dollar(15), result);
    }

    @Test
    public void testSumTimes(){
        Expressions fiveBucks = Money.dollar(5);
        Expressions fiveFrancs= Money.franc(10);
        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);
        Expressions sum = new Sum(fiveBucks, fiveFrancs).times(2);
        Money result = bank.reduce(sum, "USD");
        Assert.assertEquals(Money.dollar(20), result);
    }
}
