import java.util.List;
import java.util.function.Consumer;

/**
 * 4. Print all elements of a list using Consumer<String> and a lambda expression.
 */


public class Exercise4 {

    public static void main(String[] args) {

        List<String> stringList = List.of("Ndgg", "#%#@FGE", "123gvs");

        Consumer<String> listConsumer = System.out::println;

        stringList.forEach(listConsumer);
    }
}
