package patterns.c_behavioral.observer;

public class YoutubeUser extends User implements Subscriber {

    private int videosToWatch;

    public YoutubeUser(String name) {
        super(name);
        this.videosToWatch = 0;
    }

    @Override
    public void update() {
        videosToWatch++;
        System.out.println("Hey " + super.getName()
                + ". There is a new video on my channel! You have "
                + videosToWatch + " video to watch.");
    }

}
