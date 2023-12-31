package ConsoleAppInterface;

import Accounts.AccountController;
import Accounts.Admin;
import Accounts.Customer;
import Orders.Order;
import Products.Clothing;
import Products.Electronics;
import Products.Grocery;
import Products.ProductController;
import shoppingCart.shoppingCart;
import shoppingCart.cartController;

import java.util.Scanner;

public class ConsoleAppInterface {
    private static ProductController productController = new ProductController();
    private static AccountController accountController = new AccountController();

    public void InterfaceMenu(){
        Admin admin1 = new Admin("Youssef_Fadhloun", "Fadhloun123");
        Admin admin2 = new Admin("Admin", "Admin123");

        Grocery grocery1 = new Grocery("Apple", 1.500, 10);
        Clothing clothing1 = new Clothing("T-Shirt", 45.500, 10, "M", "White");
        Electronics electronics1 = new Electronics("Samsung Galaxy S20", 1000, 10, "Samsung");

        Customer customer1 = new Customer("Random_Person", "Random123");

        productController.addProduct(grocery1);
        productController.addProduct(clothing1);
        productController.addProduct(electronics1);

        accountController.addUser(admin1);
        accountController.addUser(admin2);
        accountController.addUser(customer1);

        Scanner sc = new Scanner(System.in);

        while(true){

            System.out.println("Welcome to our E-Commerce Console Application");
            System.out.println("1- Login");
            System.out.println("2- Register");
            System.out.println("3- Exit");
            System.out.println("Enter your choice: ");
            int c = sc.nextInt();
            sc.nextLine();
            switch(c) {
                case 1:
                    boolean test = true;
                    while(test) {
                        System.out.println("1- Login");
                        System.out.println("2- Back");
                        System.out.println("Enter your choice: ");
                        Scanner sc1 = new Scanner(System.in);
                        int c1 = sc1.nextInt();
                        sc1.nextLine();
                        switch (c1) {
                            case 1:
                                System.out.println("Enter your username: ");
                                String username = sc.nextLine();
                                System.out.println("Enter your password: ");
                                String password = sc.nextLine();
                                if (accountController.login(username, password) != "None") {
                                    System.out.println("Login successful");
                                    if (accountController.login(username, password) == "admin") {
                                        boolean test2 = true;
                                        while(test2) {
                                            System.out.println("Welcome Admin");
                                            System.out.println("What do you want to do next?");
                                            System.out.println("1- Add product");
                                            System.out.println("2- Remove product");
                                            System.out.println("3- Update product quantity");
                                            System.out.println("4- Update product price");
                                            System.out.println("5- Upadte product name");
                                            System.out.println("6- Show product by id");
                                            System.out.println("7- Show product by name");
                                            System.out.println("8- Show all products");
                                            System.out.println("9- Show all users");
                                            System.out.println("10- Show all orders");
                                            System.out.println("11- Make discount on products");
                                            System.out.println("12- Remove discount");
                                            System.out.println("13- Logout");
                                            System.out.println("Enter your choice: ");
                                            int c2 = sc.nextInt();
                                            sc.nextLine();
                                            switch (c2) {
                                                case 1:
                                                    System.out.println("1- Add product");
                                                    System.out.println("2- Back");
                                                    System.out.println("Enter your choice: ");
                                                    int c3 = sc.nextInt();
                                                    sc.nextLine();
                                                    switch (c3) {
                                                        case 1:
                                                            System.out.println("1- Add grocery");
                                                            System.out.println("2- Add clothing");
                                                            System.out.println("3- Add electronics");
                                                            System.out.println("4- Back");
                                                            System.out.println("Enter your choice: ");
                                                            int c4 = sc.nextInt();
                                                            sc.nextLine();
                                                            switch (c4) {
                                                                case 1:
                                                                    System.out.println("Enter name: ");
                                                                    String name = sc.nextLine();
                                                                    System.out.println("Enter price: ");
                                                                    double price = sc.nextDouble();
                                                                    System.out.println("Enter quantity: ");
                                                                    int quantity = sc.nextInt();
                                                                    Grocery grocery = new Grocery(name, price, quantity);
                                                                    productController.addProduct(grocery);
                                                                    break;
                                                                case 2:
                                                                    System.out.println("Enter name: ");
                                                                    String name1 = sc.nextLine();
                                                                    System.out.println("Enter price: ");
                                                                    double price1 = sc.nextDouble();
                                                                    System.out.println("Enter quantity: ");
                                                                    int quantity1 = sc.nextInt();
                                                                    System.out.println("Enter size: ");
                                                                    String size = sc.nextLine();
                                                                    System.out.println("Enter color: ");
                                                                    String color = sc.nextLine();
                                                                    Clothing clothing = new Clothing(name1, price1, quantity1, size, color);
                                                                    productController.addProduct(clothing);
                                                                    break;
                                                                case 3:
                                                                    System.out.println("Enter name: ");
                                                                    String name2 = sc.nextLine();
                                                                    System.out.println("Enter price: ");
                                                                    double price2 = sc.nextDouble();
                                                                    System.out.println("Enter quantity: ");
                                                                    int quantity2 = sc.nextInt();
                                                                    System.out.println("Enter brand: ");
                                                                    String brand = sc.nextLine();
                                                                    Electronics electronics = new Electronics(name2, price2, quantity2, brand);
                                                                    productController.addProduct(electronics);
                                                                    break;
                                                                case 4:
                                                                    break;
                                                            }
                                                        case 2:
                                                            break;
                                                        default:
                                                            System.out.println("Invalid option");
                                                            break;
                                                    }
                                                    break;
                                                case 2:
                                                    System.out.println("1- Remove product");
                                                    System.out.println("2- Back");
                                                    System.out.println("Enter your choice: ");
                                                    int c5 = sc.nextInt();
                                                    sc.nextLine();
                                                    switch (c5) {
                                                        case 1:
                                                            System.out.println("Enter product id: ");
                                                            int id = sc.nextInt();
                                                            productController.removeProduct(id);
                                                            break;
                                                        case 2:
                                                            break;
                                                        default:
                                                            System.out.println("Invalid option");
                                                            break;
                                                    }
                                                    break;
                                                case 3:
                                                    System.out.println("1- Add Product Quantity");
                                                    System.out.println("2- Reduce Product Quantity");
                                                    System.out.println("3- Back");
                                                    System.out.println("Enter your choice: ");
                                                    int c6 = sc.nextInt();
                                                    sc.nextLine();
                                                    switch (c6) {
                                                        case 1:
                                                            System.out.println("Enter product id: ");
                                                            int id = sc.nextInt();
                                                            System.out.println("Enter quantity: ");
                                                            int quantity = sc.nextInt();
                                                            productController.addProductQuantity(id, quantity);
                                                            break;
                                                        case 2:
                                                            System.out.println("Enter product id: ");
                                                            int id1 = sc.nextInt();
                                                            System.out.println("Enter quantity: ");
                                                            int quantity1 = sc.nextInt();
                                                            productController.reduceProductQuantity(id1, quantity1);
                                                            break;
                                                        case 3:
                                                            break;
                                                        default:
                                                            System.out.println("Invalid option");
                                                            break;
                                                    }
                                                    break;
                                                case 4:
                                                    System.out.println("1- Update product price");
                                                    System.out.println("2- Back");
                                                    System.out.println("Enter your choice: ");
                                                    int c28 = sc.nextInt();
                                                    sc.nextLine();
                                                    switch (c28) {
                                                        case 1:
                                                            System.out.println("Enter product id: ");
                                                            int id = sc.nextInt();
                                                            System.out.println("Enter new price: ");
                                                            double price = sc.nextDouble();
                                                            productController.updateProductPrice(id, price);
                                                            break;
                                                        case 2:
                                                            break;
                                                        default:
                                                            System.out.println("Invalid option");
                                                            break;
                                                    }
                                                    break;
                                                case 5:
                                                    System.out.println("1- Update product name");
                                                    System.out.println("2- Back");
                                                    System.out.println("Enter your choice: ");
                                                    int c29 = sc.nextInt();
                                                    sc.nextLine();
                                                    switch (c29) {
                                                        case 1:
                                                            System.out.println("Enter product id: ");
                                                            int id = sc.nextInt();
                                                            sc.nextLine();
                                                            System.out.println("Enter new name: ");
                                                            String name = sc.nextLine();
                                                            productController.updateProductName(id, name);
                                                            break;
                                                        case 2:
                                                            break;
                                                        default:
                                                            System.out.println("Invalid option");
                                                            break;
                                                    }
                                                    break;
                                                case 6:
                                                    System.out.println("1- Show product by id");
                                                    System.out.println("2- Back");
                                                    System.out.println("Enter your choice: ");
                                                    int c30 = sc.nextInt();
                                                    sc.nextLine();
                                                    switch (c30) {
                                                        case 1:
                                                            System.out.println("Enter product id: ");
                                                            int id = sc.nextInt();
                                                            productController.showProduct(productController.findProduct(id));
                                                            break;
                                                        case 2:
                                                            break;
                                                        default:
                                                            System.out.println("Invalid option");
                                                            break;
                                                    }
                                                    break;
                                                case 7:
                                                    System.out.println("1- Show product by name");
                                                    System.out.println("2- Back");
                                                    System.out.println("Enter your choice: ");
                                                    int c7 = sc.nextInt();
                                                    sc.nextLine();
                                                    switch (c7) {
                                                        case 1:
                                                            System.out.println("Enter product name: ");
                                                            String name = sc.nextLine();
                                                            productController.showProductByName(name);
                                                            break;
                                                        case 2:
                                                            break;
                                                        default:
                                                            System.out.println("Invalid option");
                                                            break;
                                                    }
                                                    break;
                                                case 8:
                                                    System.out.println("1- Show all products");
                                                    System.out.println("2- Back");
                                                    System.out.println("Enter your choice: ");
                                                    int c8 = sc.nextInt();
                                                    sc.nextLine();
                                                    switch (c8) {
                                                        case 1:
                                                            productController.ShowAllProducts();
                                                            break;
                                                        case 2:
                                                            break;
                                                        default:
                                                            System.out.println("Invalid option");
                                                            break;
                                                    }
                                                    break;
                                                case 9:
                                                    System.out.println("1- Show all users");
                                                    System.out.println("2- Back");
                                                    System.out.println("Enter your choice: ");
                                                    int c9 = sc.nextInt();
                                                    sc.nextLine();
                                                    switch (c9) {
                                                        case 1:
                                                            accountController.showUsers();
                                                            break;
                                                        case 2:
                                                            break;
                                                        default:
                                                            System.out.println("Invalid option");
                                                            break;
                                                    }
                                                    break;
                                                case 10:
                                                    System.out.println("1- Show all orders");
                                                    System.out.println("2- Back");
                                                    System.out.println("Enter your choice: ");
                                                    int c10 = sc.nextInt();
                                                    sc.nextLine();
                                                    switch (c10) {
                                                        case 1:
                                                            Order.showOrders();
                                                            break;
                                                        case 2:
                                                            break;
                                                        default:
                                                            System.out.println("Invalid option");
                                                            break;

                                                    }
                                                    break;
                                                case 11:
                                                    System.out.println("1- Make discount on products");
                                                    System.out.println("2- Back");
                                                    System.out.println("Enter your choice: ");
                                                    int c20 = sc.nextInt();
                                                    sc.nextLine();
                                                    switch (c20) {
                                                        case 1:
                                                            System.out.println("Enter discount percentage: ");
                                                            int discount = sc.nextInt();
                                                            productController.makeDiscount(discount);
                                                            break;
                                                        case 2:
                                                            break;
                                                        default:
                                                            System.out.println("Invalid option");
                                                            break;
                                                    }
                                                    break;
                                                case 12:
                                                    System.out.println("1- Remove discount");
                                                    System.out.println("2- Back");
                                                    System.out.println("Enter your choice: ");
                                                    int c21 = sc.nextInt();
                                                    sc.nextLine();
                                                    switch (c21) {
                                                        case 1:
                                                            productController.removeDiscount();
                                                            break;
                                                        case 2:
                                                            break;
                                                        default:
                                                            System.out.println("Invalid option");
                                                            break;
                                                    }
                                                    break;
                                                case 13:
                                                    test2 = false;
                                                    break;
                                                default:
                                                    System.out.println("Invalid option");
                                                    break;
                                            }
                                        }
                                    } else if (accountController.login(username, password) == "customer") {
                                        Customer customer = new Customer(username, password);
                                        int id = customer.getId();
                                        shoppingCart cart1 = null;
                                        boolean testl = false;
                                        for (shoppingCart cart : cartController.carts) {
                                            if (cart.getCustomer().getId() == id) {
                                                cart1 = cart.getCart();
                                                cartController.removeCart(cart);
                                                testl = true;
                                                break;
                                            }
                                        }
                                        if (testl == false) {
                                            cart1 = new shoppingCart(customer);
                                            cartController.addCart(cart1);
                                        }
                                        boolean test11 = true;
                                        while(test11) {
                                            System.out.println("Welcome Customer");
                                            System.out.println("What do you want to do next?");
                                            System.out.println("1- Add product to cart");
                                            System.out.println("2- Remove product from cart");
                                            System.out.println("3- Show cart");
                                            System.out.println("4- Show all products");
                                            System.out.println("5- Show Products by category");
                                            System.out.println("6- Filter");
                                            System.out.println("7- Empty the Cart");
                                            System.out.println("8- Order Cart");
                                            System.out.println("9- Logout");
                                            System.out.println("Enter your choice: ");
                                            int c11 = sc.nextInt();
                                            sc.nextLine();
                                            switch (c11) {
                                                case 1:
                                                    System.out.println("1- Add product to cart");
                                                    System.out.println("2- Back");
                                                    System.out.println("Enter your choice: ");
                                                    int c12 = sc.nextInt();
                                                    sc.nextLine();
                                                    switch (c12) {
                                                        case 1:
                                                            System.out.println("Enter product id: ");
                                                            int id1 = sc.nextInt();
                                                            System.out.println("Enter quantity: ");
                                                            int quantity = sc.nextInt();
                                                            cart1.addProduct(id1, quantity);
                                                            break;
                                                        case 2:
                                                            break;
                                                        default:
                                                            System.out.println("Invalid option");
                                                            break;
                                                    }
                                                    break;
                                                case 2:
                                                    System.out.println("1- Remove product from cart");
                                                    System.out.println("2- Back");
                                                    System.out.println("Enter your choice: ");
                                                    int c13 = sc.nextInt();
                                                    sc.nextLine();
                                                    switch (c13) {
                                                        case 1:
                                                            System.out.println("Enter product id: ");
                                                            int id1 = sc.nextInt();
                                                            cart1.removeProduct(id1);
                                                            break;
                                                        case 2:
                                                            break;
                                                        default:
                                                            System.out.println("Invalid option");
                                                            break;
                                                    }
                                                    break;
                                                case 3:
                                                    System.out.println("1- Show cart");
                                                    System.out.println("2- Back");
                                                    System.out.println("Enter your choice: ");
                                                    int c14 = sc.nextInt();
                                                    sc.nextLine();
                                                    switch (c14) {
                                                        case 1:
                                                            cart1.showCart();
                                                            break;
                                                        case 2:
                                                            break;
                                                        default:
                                                            System.out.println("Invalid option");
                                                            break;
                                                    }
                                                    break;
                                                case 4:
                                                    System.out.println("1- Show all products");
                                                    System.out.println("2- Back");
                                                    System.out.println("Enter your choice: ");
                                                    int c15 = sc.nextInt();
                                                    sc.nextLine();
                                                    switch (c15) {
                                                        case 1:
                                                            productController.ShowAllProducts();
                                                            break;
                                                        case 2:
                                                            break;
                                                        default:
                                                            System.out.println("Invalid option");
                                                            break;
                                                    }
                                                    break;
                                                case 5:
                                                    System.out.println("1- Show Products by category");
                                                    System.out.println("2- Back");
                                                    System.out.println("Enter your choice: ");
                                                    int c21 = sc.nextInt();
                                                    sc.nextLine();
                                                    switch (c21) {
                                                        case 1:
                                                            System.out.println("Enter category: ");
                                                            String category = sc.nextLine();
                                                            productController.showProductByCategory(category);
                                                            break;
                                                        case 2:
                                                            break;
                                                        default:
                                                            System.out.println("Invalid option");
                                                            break;
                                                    }
                                                    break;
                                                case 6:
                                                    System.out.println("1- Filter");
                                                    System.out.println("2- Back");
                                                    System.out.println("Enter your choice: ");
                                                    int c22 = sc.nextInt();
                                                    sc.nextLine();
                                                    switch (c22) {
                                                        case 1:
                                                            System.out.println("Enter Your Category:");
                                                            System.out.println("1- Grocery");
                                                            System.out.println("2- Clothing");
                                                            System.out.println("3- Electronics");
                                                            System.out.println("4- All");
                                                            System.out.println("Enter your choice: ");
                                                            int c23 = sc.nextInt();
                                                            sc.nextLine();
                                                            System.out.println("Enter the minimum price: ");
                                                            double minPrice = sc.nextDouble();
                                                            sc.nextLine();
                                                            System.out.println("Enter the maximum price: ");
                                                            double maxPrice = sc.nextDouble();
                                                            switch (c23) {
                                                                case 1:
                                                                    productController.showGroceryPriceRange(minPrice, maxPrice);
                                                                    break;
                                                                case 2:
                                                                    productController.showClothingPriceRange(minPrice, maxPrice);
                                                                    break;
                                                                case 3:
                                                                    productController.showElectronicsPriceRange(minPrice, maxPrice);
                                                                    break;
                                                                case 4:
                                                                    productController.showProductPricerange(minPrice, maxPrice);
                                                                    break;
                                                                default:
                                                                    System.out.println("Invalid option");
                                                                    break;
                                                            }
                                                            break;
                                                        case 2:
                                                            break;
                                                        default:
                                                            System.out.println("Invalid option");
                                                            break;
                                                    }
                                                    break;
                                                case 7:
                                                    System.out.println("1- Empty the Cart");
                                                    System.out.println("2- Back");
                                                    System.out.println("Enter your choice: ");
                                                    int c24 = sc.nextInt();
                                                    sc.nextLine();
                                                    switch (c24) {
                                                        case 1:
                                                            cart1.emptyCart();
                                                            break;
                                                        case 2:
                                                            break;
                                                        default:
                                                            System.out.println("Invalid option");
                                                            break;
                                                    }
                                                    break;
                                                case 8:
                                                    System.out.println("1- Order Cart");
                                                    System.out.println("2- Back");
                                                    System.out.println("Enter your choice: ");
                                                    int c16 = sc.nextInt();
                                                    sc.nextLine();
                                                    switch (c16) {
                                                        case 1:
                                                            Order order = new Order(customer);
                                                            order.Transaction();

                                                            break;
                                                        case 2:
                                                            break;
                                                        default:
                                                            System.out.println("Invalid option");
                                                            break;
                                                    }
                                                    break;
                                                case 9:
                                                    cart1.emptyCart();
                                                    test11 = false;
                                                    break;
                                                default:
                                                    System.out.println("Invalid option");
                                                    break;
                                            }
                                        }
                                    }
                                } else {
                                    System.out.println("Login failed");
                                    break;
                                }

                                break;
                            case 2:
                                test = false;
                                break;
                        }
                        break;
                    }
                    break;
                case 2:
                    boolean test17 = true;
                    while(test17) {
                        System.out.println("1- Register");
                        System.out.println("2- Back");
                        System.out.println("Enter your choice: ");
                        int c17 = sc.nextInt();
                        sc.nextLine();
                        switch (c17) {
                            case 1:
                                System.out.println("Enter your username: ");
                                String username = sc.nextLine();
                                System.out.println("Enter your password: ");
                                String password = sc.nextLine();
                                Customer customer = new Customer(username, password);
                                boolean unique = true;
                                for (Customer cus : accountController.customers) {
                                    if (cus.eq(customer) == 0) {
                                        unique = false;
                                        break;
                                    }
                                }
                                if (unique) {
                                    accountController.addUser(customer);
                                } else {
                                    System.out.println("Username already exists");
                                }
                                break;
                            case 2:
                                test17 = false;
                                break;
                            default:
                                System.out.println("Invalid option");
                                break;
                        }
                        break;
                    }
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }
}
