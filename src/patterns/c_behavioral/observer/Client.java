package patterns.c_behavioral.observer;

import java.util.Collections;

public class Client {

    public static void main(String[] args) {
        YoutubeChannel channel = new YoutubeChannel("Magic minecraft!");
        YoutubeUser user1 = new YoutubeUser("Jaś");
        YoutubeUser user2 = new YoutubeUser("Marcin");

        channel.subscribe(user1);
        channel.subscribe(user2);
        channel.publishNewVideo();
        System.out.println("List of subscribers: "
                + Collections.singletonList(channel.getObservers()));
        channel.unsubscribe(user2);
        channel.publishNewVideo();
        System.out.println("List of subscribers: "
                + Collections.singletonList(channel.getObservers()));
    }
}
