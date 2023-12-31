package Orders;

import Accounts.Customer;
import shoppingCart.shoppingCart;
import shoppingCart.cartController;

import java.util.ArrayList;
import java.util.Scanner;

public class Order {
    private int orderId;
    public static ArrayList<shoppingCart> carts;
    private Customer customer;

    public Order(Customer customer) {
        this.orderId = customer.getId();
        this.customer = customer;
        this.carts = new ArrayList<>();
    }

    public int getOrderId() {
        return orderId;
    }

    public void addCart(shoppingCart cart) {
        carts.add(cart);
    }

    public void removeCart(shoppingCart cart) {
        carts.remove(cart);
    }

    public ArrayList<shoppingCart> getCarts() {
        return carts;
    }

    public Customer getCustomer() {
        return customer;
    }
    public void Transaction() {
        for (shoppingCart cart : cartController.carts) {
            if (cart.getCustomer().getId() == this.orderId) {
                if (cart.getCart().isEmpty()) {
                    System.out.println("Your cart is empty");
                    System.out.println("You cannot process the order");
                    return;
                }
            }
        }
        this.orderDetails();
        System.out.println("Choose payment method: ");
        System.out.println("1. Cash on Delivery");
        System.out.println("2. Credit Card");
        System.out.println("3. Cancel Order");
        Scanner scanner = new Scanner(System.in);
        int choix = scanner.nextInt();
        scanner.nextLine();
        if (choix == 1) {
            System.out.println("Enter your address: ");
            String address = scanner.nextLine();
            System.out.println("Enter your phone number: ");
            String phone = scanner.nextLine();
            System.out.println("Order confirmed");
            for (shoppingCart cart : cartController.carts) {
                if (cart.getCustomer().getId() == this.orderId) {
                    cart.state = true;
                    cart.emptyCart();
                }
            }
            Shipping();


        } else if (choix == 2) {
            System.out.println("Enter your credit card number: ");
            String cardNumber = scanner.nextLine();
            System.out.println("Enter your credit card expiration date: ");
            String expirationDate = scanner.nextLine();
            System.out.println("Enter your credit card CVV: ");
            String cvv = scanner.nextLine();
            System.out.println("Order confirmed");
            for (shoppingCart cart : cartController.carts) {
                if (cart.getCustomer().getId() == this.orderId) {
                    cart.state = true;
                    cart.emptyCart();
                }
            }
            Shipping();
        } else if (choix == 3) {
            System.out.println("Order cancelled");
            for (shoppingCart cart : carts) {
                cart.emptyCart();
            }
        }
    }

    public void orderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customer.getUsername());
        System.out.println("Cart:");
        for (shoppingCart cart : cartController.getCarts()) {
            if(cart.getId()== this.orderId)
                cart.showCart();
                System.out.println("Total Price: " + cart.calculateTotalPrice());
                break;
        }
    }

    public static void showOrders(){
        if (carts == null){
            System.out.println("No orders");
            return;
        }
        for (shoppingCart cart : carts){
            cart.showCart();
        }
    }

    public void Shipping() {
        System.out.println("Choose shipping method: ");
        System.out.println("1. Standard Shipping");
        System.out.println("2. Express Shipping");
        System.out.println("3. Gather from store");
        Scanner sc = new Scanner(System.in);
        int choix = sc.nextInt();
        sc.nextLine();
        switch (choix) {
            case 1:
                System.out.println("Standard Shipping");
                System.out.println("Enter your town: ");
                String address = sc.nextLine();
                System.out.println("Enter your street: ");
                String street = sc.nextLine();
                System.out.println("Enter your home number: ");
                String homeNumber = sc.nextLine();
                System.out.println("Enter your phone number: ");
                String phone = sc.nextLine();
                System.out.println("Your order will be delivered to your address: " + address + " " + street + " " + homeNumber + "within the nex 48 hours");
                break;
            case 2:
                System.out.println("Express Shipping");
                System.out.println("Enter your town: ");
                String address1 = sc.nextLine();
                System.out.println("Enter your street: ");
                String street1 = sc.nextLine();
                System.out.println("Enter your home number: ");
                String homeNumber1 = sc.nextLine();
                System.out.println("Enter your phone number: ");
                String phone1 = sc.nextLine();
                System.out.println("By this shipping option your order will cost 10% more");
                for (shoppingCart cart : cartController.getCarts()) {
                    if (cart.getId() == this.orderId)
                        cart.showCart();
                    System.out.println("Total Price: " + cart.calculateTotalPrice() * 1.1);
                    break;
                }
                System.out.println("Your order will be delivered to your address: " + address1 + " " + street1 + " " + homeNumber1 + "within the nex 24 hours");
                break;
            case 3:
                System.out.println("Gather from store");
                System.out.println("Enter your town: ");
                String town = sc.nextLine();
                System.out.println("Your order is waiting for you in our" + town + "local store");
                break;
            default:
                break;
        }
    }
}