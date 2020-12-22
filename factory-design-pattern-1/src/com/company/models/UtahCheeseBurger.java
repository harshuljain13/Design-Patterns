package src.com.company.models;
import src.com.company.interfaces.*;

public class UtahCheeseBurger implements Burger{
    public void prepare(){
        System.out.println("This is Utah based Cheese Burger!");
    }
}
