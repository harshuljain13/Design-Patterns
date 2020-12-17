package com.company.models;
import com.company.interfaces.*;

public class chocolateIceCream extends IceCreamDecorator{
    public chocolateIceCream(IceCream icecream){
        super(icecream);
        System.out.println("Adding the Chocolate to Ice Cream!");
    }

    @Override
    public double cost(){
        return super.cost() + 1;
    }
}
