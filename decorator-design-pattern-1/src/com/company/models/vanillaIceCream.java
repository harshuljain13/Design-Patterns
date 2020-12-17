package com.company.models;
import com.company.interfaces.*;

public class vanillaIceCream extends IceCreamDecorator{
    public vanillaIceCream(IceCream icecream){
        super(icecream);
        System.out.println("Adding the Vanilla to Ice Cream!");
    }

    @Override
    public double cost(){
        return super.cost() + 0.5;
    }
}
