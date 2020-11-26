package patterns.c_behavioral.observer;

public interface Subject {

    void register(Subscriber subscriber);
    void unregister(Subscriber subscriber);
    void notifySubscribers();
}
