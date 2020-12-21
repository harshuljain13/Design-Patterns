package src.com.company.models;
import src.com.company.interfaces.*;
import src.com.company.models.*;

public class BurgerFactory {
    public Burger createBurger(String burgerType){
        Burger b;

        if (burgerType.equals("Veggie")){
            b = new VeggieBurger();
        }
        else {
            b = new MaharajaBurger();
        }

        b.prepare();

        return b;
    }
}
