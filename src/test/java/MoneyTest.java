import org.junit.Assert;
import org.junit.Test;

public class MoneyTest {
    @Test
    public void testEquality(){
        Assert.assertTrue(new Dollar(5).equals(new Dollar(5)));
        Assert.assertFalse(new Dollar(5).equals(new Dollar(6)));
        Assert.assertTrue(new Franc(5).equals(new Franc(5)));
        Assert.assertFalse(new Franc(5).equals(new Franc(6)));
        Assert.assertFalse(new Dollar(5).equals(new Franc(5)));
    }
}
