package patterns.c_behavioral.observer;

public interface Subject {

    void subscribe(Subscriber subscriber);
    void unsubscribe(Subscriber subscriber);
    void notifyAllSubscribers();
}
