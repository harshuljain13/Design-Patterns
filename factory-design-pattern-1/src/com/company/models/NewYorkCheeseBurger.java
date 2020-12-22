package src.com.company.models;
import src.com.company.interfaces.*;

public class NewYorkCheeseBurger implements Burger{
    public void prepare(){
        System.out.println("This is New York based Cheese Burger!");
    }
}
