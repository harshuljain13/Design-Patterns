package com.company.models;
import com.company.interfaces.*;

public class BaseIceCream implements IceCream{
    public BaseIceCream(){
        System.out.println("This is Basic Ice Cream!");
    }

    public double cost(){
        return 0.5;
    }
}
