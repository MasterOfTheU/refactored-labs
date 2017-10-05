package testing;

import org.junit.Assert;
import org.junit.Test;
import refactoring.Greeter;

public class GreeterTest {

    @Test
    public void testSayHello() {
        Greeter greeter = new Greeter();
        String actualResult = greeter.sayHello();
        String expected = "Hello, world!";
        Assert.assertEquals(expected, actualResult);
    }

    @Test
    public void nullSayHello() {
        Greeter greeter = new Greeter();
        String result = greeter.sayHello();
        Assert.assertNotNull(result);
    }
}
