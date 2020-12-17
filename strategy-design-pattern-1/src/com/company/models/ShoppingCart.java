package com.company.models;
import com.company.interfaces.Payment;
import java.util.List;
import java.util.ArrayList;

public class ShoppingCart {
    List<Product> productsList;

    public ShoppingCart(){
        this.productsList = new ArrayList<>();
    }

    public void addProduct(Product p){
        this.productsList.add(p);
    }

    public void removeProdut(Product p){
        this.productsList.remove(p);
    }

    public int CalculateTotal(){
        int sum = 0;
        for (Product p: this.productsList){
            sum += p.getprice();
        }
        return sum;
    }

    public void pay(Payment paymentStrategy){
        int amount = this.CalculateTotal();
        // pay the amount
        paymentStrategy.pay(amount);
    }
}
