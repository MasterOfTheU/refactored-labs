package testing;

import org.junit.Assert;
import org.junit.Test;
import refactoring.Greeter;

import static org.junit.Assert.*;

public class GreeterTest {
    boolean expected = Greeter.sayHello();


    @Test
    public void testSayHello() {
        Assert.assertTrue(expected);
    }

    @Test
    public void nullSayHello() {
        assertNotNull(expected);
    }
}
