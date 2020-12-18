package src.com.company;
import src.com.company.models.*;
import src.com.company.interfaces.*;

public class Main {
    public static void main(String[] args) {
        stockTopic t1 = new stockTopic("T1");
        subscriberInterface s1 = new Subscriber("s1");
        subscriberInterface s2 = new Subscriber("s2");
        subscriberInterface s3 = new Subscriber("s3");
        
        t1.subscribe(s1);
        t1.subscribe(s2);
        t1.unsubscribe(s2);
        t1.subscribe(s3);

        t1.publish("APPL", 127.57);
    }
}
