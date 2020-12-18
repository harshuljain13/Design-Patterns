package src.com.company.models;
import src.com.company.interfaces.*;
import java.util.*;

public class stockTopic implements TopicInterface {
    private String name;
    private List<subscriberInterface> subscribers = new ArrayList<subscriberInterface>();
    private String stocksymbol;
    private double stockValue;

    public stockTopic(String name){
        this.name = name;
    }

    public String getname(){
        return this.name;
    }

    public void subscribe(subscriberInterface subscriber){
        System.out.println("Subscribing the subscriber: " + subscriber.getname());
        if (!this.subscribers.contains(subscriber)){
            this.subscribers.add(subscriber);
        }
        return;
    }

    public void unsubscribe(subscriberInterface subscriber){
        System.out.println("Unsubscribing the subscriber: " + subscriber.getname());
        this.subscribers.remove(subscriber);
    }

    public void notifySubscribers(){
        System.out.println("Notifying all subscribers of this topic");
        for (subscriberInterface subscriber: this.subscribers){
            System.out.println("Notifying the subscriber: " + subscriber.getname());
            subscriber.inform(this);
            
        }
    }

    public void publish(String stocksymbol, double d){
        this.stocksymbol = stocksymbol;
        this.stockValue = d;
        System.out.println("Information published to the topic: " + this.name);
        this.notifySubscribers();
    }

    public String getUpdate(){
        return this.stocksymbol + ": " + Double.toString(this.stockValue);
    }

}
