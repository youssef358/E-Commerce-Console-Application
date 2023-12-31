package shoppingCart;

import java.util.ArrayList;

public class cartController{
    public static ArrayList<shoppingCart> carts = new ArrayList<shoppingCart>();

    public cartController() {
        carts = new ArrayList<shoppingCart>();
    }

    public static void addCart(shoppingCart cart) {
        carts.add(cart);
    }

    public static void removeCart(shoppingCart cart) {
        carts.remove(cart);
    }

    public static ArrayList<shoppingCart> getCarts() {
        return carts;
    }

    public static void showCartWithId(int id) {
        for (shoppingCart cart : carts) {
            if (cart.getCustomer().getId() == id) {
                System.out.println(cart);
                break;
            }
        }
    }

    public int calculateTotalPrice() {
        int totalPrice = 0;
        for (shoppingCart cart : carts) {
            totalPrice += cart.calculateTotalPrice();
        }
        return totalPrice;
    }

}
