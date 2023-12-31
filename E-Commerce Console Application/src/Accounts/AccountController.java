package Accounts;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountController{


    public static ArrayList<User> users;
    public static ArrayList<Customer> customers;
    public static ArrayList<Admin> admins;

    public AccountController(){
        users = new ArrayList<User>();
        customers = new ArrayList<Customer>();
        admins = new ArrayList<Admin>();
    }
    public void addUser(User user){
        users.add(user);
        if(user instanceof Customer){
            customers.add((Customer)user);
        }
        else if(user instanceof Admin){
            admins.add((Admin)user);
        }
    }
    public void removeUser(User user){
        users.remove(user);
        if(user instanceof Customer){
            customers.remove((Customer)user);
        }
        else if(user instanceof Admin){
            admins.remove((Admin)user);
        }
    }
    public void removeUserWithUsername(String username){
        for(User user : users){
            if(user.getUsername().equals(username)){
                users.remove(user);
                if(user instanceof Customer){
                    customers.remove((Customer)user);
                }
                else if(user instanceof Admin){
                    admins.remove((Admin)user);
                }
                break;
            }
        }
    }
    public static ArrayList<User> getUsers(){
        return users;
    }

    public ArrayList<Customer> getCustomers(){
        return customers;
    }

    public ArrayList<Admin> getAdmins(){
        return admins;
    }
    public void createCustomerAccount(){
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String password = scanner.nextLine();
        Customer customer = new Customer(username, password);
        boolean unique = true;
        for(User c : users){
            if(c.eq(customer) == 0){
                unique = false;
                break;
            }
        }
        if(unique){
            addUser(customer);
        }
        else{
            System.out.println("Username already exists");
        }
    }
    public void createAdminAccount(){
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String password = scanner.nextLine();
        Admin admin = new Admin(username, password);
        boolean unique = true;
        for(User a : users){
            if(a.eq(admin) == 0){
                unique = false;
                break;
            }
        }
        if(unique){
            addUser(admin);
        }
        else{
            System.out.println("Username already exists");
        }
    }
    public void showUsers(){
        for(User user : users){
            System.out.println(user);
            if (user instanceof Admin){
                System.out.println("Admin");
            }
            else if (user instanceof Customer){
                System.out.println("Customer");
            }
        }
    }

    public String login(String username, String password){
        for(User user : users){
            if(user.getUsername().equals(username) && user.getPassword().equals(password)){
                if (user instanceof Admin){
                    return "admin";
                }
                else if (user instanceof Customer){
                    return "customer";
                }
            }
        }
        return "None";
    }
}
