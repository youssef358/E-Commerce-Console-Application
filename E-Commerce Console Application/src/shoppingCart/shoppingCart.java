package shoppingCart;

import Accounts.Customer;
import Products.Product;
import Products.ProductController;

import java.util.HashMap;
import java.util.Map;

public class shoppingCart {
    public boolean state = false;
    protected HashMap<Product, Integer> shoppingcart;
    protected Customer customer;
    protected int id;

    public shoppingCart(Customer customer) {
        this.customer = customer;
        this.id = customer.getId();
        this.shoppingcart = new HashMap<>();
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public int getId() {
        return this.id;
    }
    public void addProduct(int id, int quantity) {
        boolean test = false;

        for (Product product : ProductController.getProducts()) {
            if (product.getId() == id) {
                test = true;
                if(quantity > product.getQuantity()) {
                    System.out.println("Not enough quantity in Inventory");
                    return;
                }
                else {
                    this.shoppingcart.put(product, quantity);
                    product.setQuantity(product.getQuantity() - quantity);
                }
            }
        }
        if(!test) {
            System.out.println("Product not found in Inventory");
        }
    }

    public void removeProduct(int id) {
        for (Map.Entry<Product, Integer> entry : shoppingcart.entrySet()) {
            Product product = entry.getKey();
            int quantity = entry.getValue();
            if (product.getId() == id) {
                product.setQuantity(product.getQuantity() + quantity);
                this.shoppingcart.remove(product);
                return;
            }
        }
        System.out.println("Product not found in cart");
    }

    public double calculateProductPrice(int id) {
        for (Map.Entry<Product, Integer> entry : shoppingcart.entrySet()) {
            Product product = entry.getKey();
            int quantity = entry.getValue();
            if (product.getId() == id) {
                return product.getPrice() * quantity;
            }
        }
        return 0;
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (Map.Entry<Product, Integer> entry : shoppingcart.entrySet()) {
            Product product = entry.getKey();
            int quantity = entry.getValue();
            totalPrice += product.getPrice() * quantity;
        }
        return totalPrice;
    }

    public void showCart() {
        if (shoppingcart.isEmpty()) {
            System.out.println("Cart is empty");
            return;
        }
        for (Map.Entry<Product, Integer> entry : shoppingcart.entrySet()) {
            Product product = entry.getKey();
            int quantity = entry.getValue();
            System.out.println("Product: " + product.getName() + " Price: " + product.getPrice() + " Quantity: " + quantity);
        }
        System.out.println("Total Price: " + calculateTotalPrice());
    }

    public void emptyCart(){
        if(state == false){
            for (Map.Entry<Product, Integer> entry : shoppingcart.entrySet()) {
                Product product = entry.getKey();
                int quantity = entry.getValue();
                product.setQuantity(product.getQuantity() + quantity);
            }
            this.shoppingcart.clear();
            System.out.println("Cart is empty");
        }
        else {
            this.shoppingcart.clear();
            System.out.println("Cart is empty");
        }
    }

    public shoppingCart getCart(){
        return this;
    }


    public boolean isEmpty() {
        return shoppingcart.isEmpty();
    }
}

