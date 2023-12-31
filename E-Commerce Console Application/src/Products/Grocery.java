package Products;

import java.util.Scanner;

public class Grocery extends Product {
    public Grocery(String name, double price, int quantity) {
        super(name, price, quantity);
        this.category = "Grocery";
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
    }


    @Override
    public void showProduct() {
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Category: " + getCategory());
        System.out.println("Price: " + getPrice());
        System.out.println("Quantity: " + getQuantity());
    }
}
