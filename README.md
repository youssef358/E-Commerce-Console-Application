# E-Commerce-Console-Application

## Overview
This E-Commerce Console Application is a system that demonstrates how online shopping applications work. This appication provides multiple features such as User Authentication, Product Management, Order Processing etc... This README file is enumerating all the features used, explaining my design decisions and OOP implementaion

## Features

### User Authentication
- This application implements a Login / Logout and sign-up system for users
- The users will have different interfaces based on their roles (i.e. Admin , Customer)
### Product Management
- An admin will be able to perform CRUD operations on products in the Inventory
- Users will be able to see all the products available in the Inventory
- Every product is defined by one of the next three Categories: Grocery , Clothing, Electronics
- Each class has some specific attributes
### Shopping Cart
- Customers will be able to add, remove, and update the quantity of products he chose in his Cart
- Every product added to the customer's cart will be removed from the Inventory until the customer makes his order decision (i.e. Buys the product or leaves it)
- Every Customer will have the choice to decide what to do with the cart: Either emptying it, or making the Order Process
- Logging out will automatically empty the Cart and restore the Inventory to its previous state
### Order Processing
- Customer will procede to the Payment and Shipping Process
- The order Details will be shown before choosing the payment option
- Admin will be able to see all orders made
### Inventory Management
- As said above, to avoid several problems, if the customer chooses a product to add to the cart, it will be automatically removed from the Inventory
- When the customer leaves without proceeding to the Order Process, the Inventory will be restored to its original state
- Admins will be able to add, remove, update product quantities in the Inventory
### Dynamic Product Search And Filtering
- Customers will be able to search for products by Category, or filtering them by price
### Payment Processing
- The application provides 2 payment options: Cash On Delivery and Online Payment
- By choosing the second option, the user will have to enter his Credit Card informations to complete his order
- 
## Optional Features

### Discounts and Promotions
- The admins will be able to apply discounts on the products.
- Only one discount will be applied
- Before applying another discount, the admin will have to remove the old one
### Shipping Options
- After the Payment Process, customer will have to choose a shipping option
- The Program provides 3 options:
- Standard Shipping which is free
- Express Shipping which will add 10% to the total Price
For the two above options, customer will have to enter his address details
- Gather from store, customer will have to enter his town so that he can go to the local town store and recuperate his order

