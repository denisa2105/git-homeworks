import java.util.List;

/**
 2. Filter a list of strings to only include those starting with "A" using a lambda expression.
 */
public class Exercise2 {

    public static void main(String[] args) {

        List<String> strings = List.of("Ana", "Elena", "Evelin", "Sorin");

        List<String> filteredStrings = strings.stream()
                .filter(word -> word.startsWith("A"))
                .toList();

        System.out.println("Words starting with A: " + filteredStrings);
    }
}
