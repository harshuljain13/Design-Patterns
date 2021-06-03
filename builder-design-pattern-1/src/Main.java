package src;

public class Main {
    public static void main(String[] args){
        Person p = new Person.PersonBuilder("Harshul", "Jain").age(27).email("Harshuljain1393@gmail.com").build();
        System.out.println(p.toString());
    }
    
}
