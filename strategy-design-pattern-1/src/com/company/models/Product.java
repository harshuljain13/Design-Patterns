package com.company.models;

public class Product {
    private String upcCode;
    private int price;

    public Product(String upcCode, int price){
        this.upcCode = upcCode;
        this.price = price;
    }

    public String getupcCode(){
        return this.upcCode;
    }

    public int getprice(){
        return this.price;
    }

    public void setupcCode(String upcCode){
        this.upcCode = upcCode;
    }

    public void setprice(int amt){
        this.price = amt;
    }
}
