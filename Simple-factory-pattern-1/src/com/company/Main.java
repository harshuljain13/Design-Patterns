package src.com.company;

import src.com.company.models.BurgerFactory;
import src.com.company.interfaces.*;

public class Main {
    public static void main(String[] args) {
        // 
        BurgerFactory factory = new BurgerFactory();
        
        Burger b1 = factory.createBurger("Veggie");
        Burger b2 = factory.createBurger("Maharaja");
        
    }
}
