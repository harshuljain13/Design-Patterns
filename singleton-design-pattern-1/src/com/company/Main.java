package src.com.company;

public class Main {
    public static void main(String[] args){
        DbConn dbconn1 = DbConn.getInstance();
        DbConn dbconn2 = DbConn.getInstance();

        dbconn1.setName("database 1");
        System.out.println("Database Connection points to: " + dbconn2.getName());
    }
}
