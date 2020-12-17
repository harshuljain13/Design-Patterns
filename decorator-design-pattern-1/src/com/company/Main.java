package com.company;
import com.company.interfaces.*;
import com.company.models.*;

public class Main {
    public static void main(String[] args) {
        IceCream baseicecream = new BaseIceCream();
        double baseCost = baseicecream.cost();
        System.out.println("Base cost of the Ice Cream: " + baseCost + " USD");

        IceCream chocolateicecream = new chocolateIceCream(baseicecream);
        double chocolateIceCreamCost = chocolateicecream.cost();
        System.out.println("Cost of Chocolate Ice Cream: " + chocolateIceCreamCost + " USD");

        IceCream vanillachocolateicecream = new vanillaIceCream(chocolateicecream);
        double vanillaChocolateIceCreamCost = vanillachocolateicecream.cost();
        System.out.println("Cost of Vanilla Chocolate Ice Cream: " + vanillaChocolateIceCreamCost + " USD");
    }
}
