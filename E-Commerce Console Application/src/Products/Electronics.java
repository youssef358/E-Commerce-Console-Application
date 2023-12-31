package Products;


import java.util.Scanner;

public class Electronics extends Product {
    private String brand;

    public Electronics(String name, double price, int quantity, String brand) {
        super(name, price, quantity);
        this.category = "Electronics";
        this.brand = brand;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
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
        System.out.println("Enter new brand: ");
        String brand = sc.nextLine();
        setBrand(brand);
    }

    @Override
    public void showProduct() {
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Price: " + getPrice());
        System.out.println("Quantity: " + getQuantity());
        System.out.println("Brand: " + getBrand());
    }
}

