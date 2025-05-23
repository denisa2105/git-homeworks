package model;

public class Customer {

    private String name;
    private String address;
    private String email;

    public Customer(String name, String address, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
    }

    public Order placeOrder(String productName, int quantity, double price) {
        return new Order(this.name, productName, quantity, price);
    }

}