package src.com.company;

public class DbConn {

    public static DbConn ins;
    String name;

    public DbConn() {
    }

    public static DbConn getInstance() {
        if (ins == null) {
            ins = new DbConn();
        }
        return ins;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
}
