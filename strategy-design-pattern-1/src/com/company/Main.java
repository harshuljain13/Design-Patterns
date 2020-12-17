package com.company;
import com.company.models.*;


public class Main {

    public static void main(String[] args) {
	// write your code here
        ShoppingCart cart = new ShoppingCart();
        Product pants = new Product("234", 25);
        Product shirt = new Product("987", 10);

        cart.addProduct(pants);
        cart.addProduct(shirt);

        // invoking strategy 1
        cart.pay(new CashPayment());

        // invoking strategy 2
        cart.pay(new CreditCardPayment("Harshul", "1234-5678-9999"));
    }
}
