package itschool.model;

public class Car {

    // instance variables
    private int year;
    private String brand;
    private String model;
    private String color;
    private int price;
    private boolean isUsed;

    public Car() {

    }

    public Car(int year,
               String brand,
               String model,
               String color,
               int price,
               boolean isUsed) {
        this.year = year;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.isUsed = isUsed;
    }

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;

        // default values
        this.year = 2024;
        this.color = "Black";
        this.price = 10000;
        this.isUsed = false;
    }

    public void setPrice(int price) {
        if (price < 0) {
            System.out.println("Price cannot be negative");
            return;
        }
        this.price = price;
    }

    public int getPrice() {
        return price;
    }



    // instance methods
    public void drive() {
        System.out.println("Driving the car " + brand + " " + model + " having color " + color);
    }

    public void buyCar(int balance) {
        if (balance < price) {
            System.out.println("You don't have enough money to buy this car");
            return;
        }

        System.out.println("Buying the car called " + brand + " " + model + " having color " + color);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isUsed() {
        return isUsed;
    }

    public void setUsed(boolean used) {
        isUsed = used;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}

