package com.company.interfaces;

public class IceCreamDecorator implements IceCream {
    private IceCream icecream;

    public IceCreamDecorator(IceCream icecream){
        this.icecream = icecream;
    }

    public double cost(){
        return this.icecream.cost();
    }
}
