package refactoring;

public class Greeter {

    String message;

    public Greeter() {
        message = "Hello, world!";
    }

    public String sayHello() {
        return this.message;
    }
}
