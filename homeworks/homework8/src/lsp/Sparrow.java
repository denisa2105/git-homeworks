package lsp;

public class Sparrow extends Bird implements Flyable {

    protected Sparrow(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Sparrow is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Sparrow is sleeping");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }
}
