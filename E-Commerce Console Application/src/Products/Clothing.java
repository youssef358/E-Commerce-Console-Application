package Products;

import java.util.Scanner;

public class Clothing extends Product {
    private String size;
    private String color;

    public Clothing(String name, double price, int quantity, String size, String color) {
        super(name, price, quantity);
        this.category = "Clothing";
        this.size = size;
        this.color = color;
    }

    public String getSize() {
        return this.size;
    }

    public String getColor() {
        return this.color;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void updateProduct() {
        System.out.println("Enter new name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        setName(name);
        System.out.println("Enter new price: ");
        double price = sc.nextDouble();
        setPrice(price);
        System.out.println("Enter new quantity: ");
        int quantity = sc.nextInt();
        setQuantity(quantity);
        System.out.println("Enter new size: ");
        String size = sc.nextLine();
        setSize(size);
        System.out.println("Enter new color: ");
        String color = sc.nextLine();
        setColor(color);
    }

    @Override
    public void showProduct() {
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Price: " + getPrice());
        System.out.println("Quantity: " + getQuantity());
        System.out.println("Size: " + getSize());
        System.out.println("Color: " + getColor());
    }
}

