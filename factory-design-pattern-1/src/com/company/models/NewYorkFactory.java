package src.com.company.models;
import src.com.company.interfaces.*;

public class NewYorkFactory implements Factory{
    public Burger createBurger(String t){
        Burger b;

        if (t.equals("Cheese")){
            b = new NewYorkCheeseBurger();
        }
        else{
            b = new NewYorkMaharajaBurger();
        }
        b.prepare();
        return b;
    }
}
