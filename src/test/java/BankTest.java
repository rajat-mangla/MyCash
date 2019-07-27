import org.junit.Assert;
import org.junit.Test;

public class BankTest {
    @Test
    public void testReduceSum(){
        Expressions sum = new Sum(Money.dollar(3), Money.dollar(4));
        Bank bank = new Bank();
        Money result = bank.reduce(sum, "USD");
        Assert.assertEquals(Money.dollar(7), result);
    }
}
