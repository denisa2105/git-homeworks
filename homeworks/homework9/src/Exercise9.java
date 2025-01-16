import java.util.function.Consumer;

/**
 * 9. Use the built-in Consumer<String> functional interface to print strings prefixed with "Hello, ".
 */

public class Exercise9 {

    public static void main(String[] args) {

        Consumer<String> printStrings = s -> System.out.println("Hello, " + s);

        printStrings.accept("World!");
    }
}
