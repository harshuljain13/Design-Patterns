package src.com.company.models;
import src.com.company.interfaces.*;

public class VeggieBurger implements Burger{
    public void prepare(){
        System.out.println("Preparing Veggie Burger!");
    }
}
