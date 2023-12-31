package Products;

import java.util.ArrayList;
import java.util.List;

public class ProductController {
    public static List<Product> products = new ArrayList<>();
    public static List<Grocery> groceries = new ArrayList<>();
    public static List<Clothing> clothes = new ArrayList<>();
    public static List<Electronics> electronics = new ArrayList<>();
    public static int discount = 0;

    public void addProduct(Product product) {
        products.add(product);
        if (product instanceof Grocery) {
            groceries.add((Grocery) product);
        } else if (product instanceof Clothing) {
            clothes.add((Clothing) product);
        } else if (product instanceof Electronics) {
            electronics.add((Electronics) product);
        }
        product.showProduct();
        System.out.println("Added successfully");
    }

    public static List<Product> getProducts() {
        return products;
    }

    public void removeProduct(int id){
        boolean test = false;
        for (Product product : products) {
            if (product.getId() == id) {
                products.remove(product);
                test = true;
                break;
            }
        }
        if (!test) {
            System.out.println(id + "Product not found");
        }
    }

    public void showProductByName(String name) {
        boolean test = false;
        for (Product product : products) {
            if (product.getName().equals(name)) {
                product.showProduct();
                test = true;
            }
        }
        if (!test) {
            System.out.println(name + "Product not found");
        }
    }

    public void ShowAllProducts() {
        for (Product product : products) {
            product.showProduct();
            System.out.println();
        }
    }
    public void addProductQuantity(int id, int quantity) {
        boolean test = false;
        for (Product product : products) {
            if (product.getId() == id) {
                product.setQuantity(product.getQuantity() + quantity);
                System.out.println(product.getId() + "quantity added successfully");
                test = true;
                break;
            }
        }
        if (!test) {
            System.out.println(id + "Product not found");
        }
    }

    public void reduceProductQuantity(int id, int quantity) {
        boolean test = false;
        for (Product product : products) {
            if (product.getId() == id) {
                if (product.getQuantity() >= quantity) {
                    product.setQuantity(product.getQuantity() - quantity);
                    System.out.println(product.getId() + "quantity reduced successfully");
                    test = true;
                    break;
                } else {
                    System.out.println( "Not enough quantity");
                    test = true;
                    break;
                }
            }
        }
        if (!test) {
            System.out.println(id + "Product not found");
        }
    }

    public void makeDiscount(int percentage){
        if (discount == 0) {
            discount = percentage;
            for (Product product : products) {
                product.setPrice(product.getPrice() * (100 - percentage) / 100);
            }
        } else {
            System.out.println("Discount already exists");
        }
    }

    public void removeDiscount(){
        if (discount != 0) {
            for (Product product : products) {
                product.setPrice(product.getPrice() * 100 / (100 - discount));
            }
            discount = 0;
        } else {
            System.out.println("No discount exists");
        }
    }

    public void showProductPricerange(double min, double max){
        for (Product product : products) {
            if (product.getPrice() >= min && product.getPrice() <= max) {
                product.showProduct();
                System.out.println();
            }
        }
    }

    public void showProductByCategory(String category){
        if ((category).equalsIgnoreCase("grocery")) {
            for (Grocery grocery : groceries) {
                grocery.showProduct();
                System.out.println();
            }
        } else if ((category).equalsIgnoreCase("clothing")) {
            for (Clothing clothing : clothes) {
                clothing.showProduct();
                System.out.println();
            }
        } else if ((category).equalsIgnoreCase("electronics")) {
            for (Electronics electronic : electronics) {
                electronic.showProduct();
                System.out.println();
            }
        }
    }

    public void showGroceryPriceRange(double min, double max){
        for (Grocery grocery : groceries) {
            if (grocery.getPrice() >= min && grocery.getPrice() <= max) {
                grocery.showProduct();
                System.out.println();
            }
        }
    }

    public void showClothingPriceRange(double min, double max){
        for (Clothing clothing : clothes) {
            if (clothing.getPrice() >= min && clothing.getPrice() <= max) {
                clothing.showProduct();
                System.out.println();
            }
        }
    }

    public void showElectronicsPriceRange(double min, double max){
        for (Electronics electronic : electronics) {
            if (electronic.getPrice() >= min && electronic.getPrice() <= max) {
                electronic.showProduct();
                System.out.println();
            }
        }
    }

    public Product findProduct(int id) throws IllegalArgumentException {
        boolean test = false;
        for (Product product : products) {
            if (product.getId() == id) {
                test = true;
                return product;
            }
        }
        if (!test) {
            throw new IllegalArgumentException("Product not found");
        }
        return null;
    }

    public void updateProductName(int id, String name) {
        boolean test = false;
        for (Product product : products) {
            if (product.getId() == id) {
                product.setName(name);
                System.out.println(product.getId() + "name updated successfully");
                test = true;
                break;
            }
        }
        if (!test) {
            System.out.println(id + "Product not found");
        }
    }

    public void updateProductPrice(int id, double price) {
        boolean test = false;
        for (Product product : products) {
            if (product.getId() == id) {
                product.setPrice(price);
                System.out.println(product.getId() + "price updated successfully");
                test = true;
                break;
            }
        }
        if (!test) {
            System.out.println(id + "Product not found");
        }
    }

    public void showProduct(Product product) {
        product.showProduct();
    }





}



