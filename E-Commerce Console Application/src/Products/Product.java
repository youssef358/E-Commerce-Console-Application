package Products;

import static java.lang.Math.abs;

public abstract class Product {
    protected int id;
    protected String name;
    protected double price;
    protected int quantity;
    protected String category = "Other";

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.id = abs(this.name.hashCode());
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public int getQuantity() {
        return this.quantity;
    }
    public String getCategory() {
        return this.category;
    }
    public int getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public abstract void updateProduct();

    public abstract void showProduct();
}


