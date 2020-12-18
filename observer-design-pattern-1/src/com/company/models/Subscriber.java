package src.com.company.models;

import src.com.company.interfaces.*;

public class Subscriber implements subscriberInterface{
    private String name;

    public Subscriber(String name){
        this.name = name;
    }

    public String getname(){
        return this.name;
    }

    public void inform(TopicInterface topic){
        System.out.println("Notification received from the topic: " + topic.getname());
        System.out.println("Retrieving information");
        String info = topic.getUpdate();
        System.out.println("information: " + info);
    }
}
