package src.com.company.interfaces;

public interface TopicInterface {
    public String getname();
    public void subscribe(subscriberInterface subscriber);
    public void unsubscribe(subscriberInterface subscriber);
    public void notifySubscribers();
    public String getUpdate();
}
