package patterns.b_structural.facade;

public class MainDoor implements Door {

    @Override
    public void close() {
        System.out.println("Closing main door.");
    }

    @Override
    public void open() {
        System.out.println("Opening main door.");
    }

    @Override
    public void lock() {
        System.out.println("Main door locked.");
    }

    @Override
    public void unlock() {
        System.out.println("Main door unlocked.");
    }
}
