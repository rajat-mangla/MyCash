import org.junit.Assert;
import org.junit.Test;

public class MoneyTest {
    @Test
    public void testEquality(){
        Assert.assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        Assert.assertFalse(Money.dollar(5).equals(Money.dollar(6)));
        Assert.assertTrue(Money.franc(5).equals(Money.franc(5)));
        Assert.assertFalse(Money.franc(5).equals(Money.franc(6)));
        Assert.assertFalse(Money.dollar(5).equals(Money.franc(5)));
    }

    @Test
    public void testCurrency(){
        Assert.assertEquals("USD", Money.dollar(1).currency());
        Assert.assertEquals("CHF", Money.franc(1).currency());
    }
}
