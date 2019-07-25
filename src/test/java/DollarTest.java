import org.junit.Assert;
import org.junit.Test;

public class DollarTest {
    @Test
    public void testMultiplication() {
        Money five= Money.dollar(5);
        Assert.assertEquals(Money.dollar(10), five.times(2));
        Assert.assertEquals(Money.dollar(15), five.times(3));
    }
}
