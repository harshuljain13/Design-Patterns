package src.com.company.models;
import src.com.company.interfaces.*;

public class UtahFactory implements Factory {
    public Burger createBurger(String t){
        Burger b;

        if (t.equals("Cheese")){
            b = new UtahCheeseBurger();
        }
        else{
            b = new UtahMaharajaBurger();
        }

        b.prepare();
        return b;
    }
}
