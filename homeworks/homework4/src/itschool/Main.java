package itschool;

import itschool.model.Car;
import itschool.model.Customer;

public class Main {
    public static void main(String[] args) {
        Car defaultCar = new Car();

        // System.out.println(defaultCar.brand);
        // defaultCar.year = 10;

        Car toyota = new Car("Toyota", "Corolla");
        Car allParamCar = new Car(2020, "Toyota", "Corolla",
                "black", 10000, false);

        Car myCar = new Car(2024, "Volkswagen", "Golf",
                "red", 20000, false);

        myCar.drive();

        toyota.drive();

        System.out.println("--------------------");

        int balance = 100000;
        // myCar.price = 100000;
        myCar.buyCar(balance);

//        Customer customer = new Customer();
//        Customer.CreditCard creditCard = customer.someMethod();

//        Customer customer = new Customer();

        int price = myCar.getPrice();
        price = 10;
    }
}