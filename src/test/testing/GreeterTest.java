package testing;

import org.junit.Test;
import refactoring.Greeter;

import static org.junit.Assert.*;

public class GreeterTest {
    String expected = Greeter.sayHello();
    String actualResult = helloWorld();

    public static String helloWorld() {
        return "Hello, world!\n";
    }

    @Test
    public void testSayHello() {
        assertEquals(expected, actualResult);
    }

    @Test
    public void nullSayHello() {
        assertNotNull(expected);
    }
}
