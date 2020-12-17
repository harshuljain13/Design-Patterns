package com.company.models;
import com.company.interfaces.Payment;

public class CashPayment implements Payment{

    @Override
    public void pay(int amount){
        System.out.println(amount + " Paid in the cash");
    }
}
