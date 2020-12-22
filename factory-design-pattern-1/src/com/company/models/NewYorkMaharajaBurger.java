package src.com.company.models;
import src.com.company.interfaces.*;

public class NewYorkMaharajaBurger implements Burger{
    public void prepare(){
        System.out.println("This is New York based Maharaja Burger!");
    }
}
