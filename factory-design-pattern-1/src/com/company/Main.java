package src.com.company;
import src.com.company.interfaces.*;
import src.com.company.models.*;

public class Main {
    public static void main(String[] args) {
        Factory nyfactory = new NewYorkFactory();
        nyfactory.createBurger("Cheese");
        nyfactory.createBurger("Maharaja");
        
        Factory utahfactory = new UtahFactory();
        utahfactory.createBurger("Cheese");
        utahfactory.createBurger("Maharaja");
    }
}
