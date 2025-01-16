/**
 * 10. Define a functional interface Transformer<T> with a method T transform(T input) and use a lambda to reverse
 * a string.
 */

public class Exercise10 {

    public static void main(String[] args) {

       Transformer<String> transformer = s -> new StringBuilder(s).reverse().toString();

        System.out.println(transformer.transform("Denisa"));
    }
}

@FunctionalInterface
interface Transformer<T> {
    T transform(T input);
}