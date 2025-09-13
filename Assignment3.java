// Assignment3.java
interface Sellable {
    void displayItemDetails();
    double getPrice();
}

abstract class Product implements Sellable {
    protected String name;
    protected String category;

    public Product(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public abstract double calculateDiscount();

    public double priceAfterDiscount() {
        return getPrice() - calculateDiscount();
    }
}

class ElectronicItem extends Product {
    private double price;
    private double warrantyYears;

    public ElectronicItem(String name, String category, double price, double warrantyYears) {
        super(name, category);
        this.price = price;
        this.warrantyYears = warrantyYears;
    }

    @Override
    public void displayItemDetails() {
        System.out.println("Item: " + name);
        System.out.println("Category: " + category);
        System.out.printf("Price: %.0f%n", price);
        System.out.printf("Discounted Price: %.0f%n", priceAfterDiscount());
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public double calculateDiscount() {
        return price * 0.10; // flat 10% discount
    }
}

public class Assignment3 {
    public static void main(String[] args) {
        ElectronicItem laptop = new ElectronicItem("Laptop", "Electronics", 50000, 2);
        laptop.displayItemDetails();
    }
}
