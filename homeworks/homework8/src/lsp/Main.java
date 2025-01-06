package lsp;

/**
 * Refactor the code to ensure it adheres to LSP.
 */
public class Main {

    public static void main(String[] args) {

        Bird sparrow = new Sparrow("Sparrow");
        sparrow.eat();
        sparrow.sleep();
        ((Flyable) sparrow).fly(); // cast pentru a apela metoda fly


        Bird penguin = new Penguin("Penguin");
        penguin.eat();
        penguin.sleep();

    }

}