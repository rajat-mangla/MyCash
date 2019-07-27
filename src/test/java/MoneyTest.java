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
    public void testDifferentCurrencyEquality(){
        Assert.assertTrue(new Money(10, "CHF").equals(Money.franc(10)));
    }

    @Test
    public void testMultiplication(){
        Money dollar = Money.dollar(10);
        Assert.assertEquals(Money.dollar(20), dollar.times(2));
    }
    @Test
    public void testCurrency(){
        Assert.assertEquals("USD", Money.dollar(1).currency());
        Assert.assertEquals("CHF", Money.franc(1).currency());
    }

    @Test
    public void testAddition(){
        Expressions sum = Money.dollar(5).plus(Money.dollar(5));
        Bank bank = new Bank();
        Money reduce = bank.reduce(sum, "USD");
        Assert.assertEquals(Money.dollar(10), reduce);
    }

    @Test
    public void testPlusReturnsSum(){
        Money five = Money.dollar(5);
        Expressions result = five.plus(five);
        Sum sum = (Sum) result;
        Assert.assertEquals(five, sum.augend);
        Assert.assertEquals(five, sum.addend);
    }
}
