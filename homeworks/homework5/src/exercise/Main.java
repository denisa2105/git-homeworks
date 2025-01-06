package exercise;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Lil", 3);
        animal.makeSound();

        System.out.println("-----------------");

        Dog dog = new Dog("Max", 4);
        dog.makeSound();

        System.out.println("-----------------");

        Cat cat = new Cat("Tom", 5);
        cat.makeSound();
    }
}
