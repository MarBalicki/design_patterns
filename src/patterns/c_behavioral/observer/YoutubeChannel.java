package patterns.c_behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject {

    private final String channelName;
    private final List<Subscriber> subscribers;

    public YoutubeChannel(String channelName) {
        this.channelName = channelName;
        this.subscribers = new ArrayList<>();
    }

    public String getChannelName() {
        return channelName;
    }

    public List<Subscriber> getObservers() {
        return subscribers;
    }

    public void publishNewVideo() {
        System.out.println("Channel '" + channelName + "' published new video!");
        notifySubscribers();
    }

    @Override
    public void register(Subscriber subscriber) {
        subscribers.add(subscriber);
        System.out.println(subscriber + " subscribe channel name " + channelName);
    }

    @Override
    public void unregister(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update();
        }
    }
}
