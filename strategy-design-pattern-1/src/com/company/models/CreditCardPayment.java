package com.company.models;
import com.company.interfaces.Payment;

public class CreditCardPayment implements Payment{

    private String name;
    private String cardNumber;

    public CreditCardPayment(String name, String cardNumber){
        this.name = name;
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount){
        System.out.println(name + " Paid " + amount + " with card " + this.cardNumber);
    }
}
