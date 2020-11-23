package patterns.b_structural.facade.example1.hidden_bussines_logic;

class GarageDoor implements Door {

    @Override
    public void close() {
        System.out.println("Closing garage door.");
    }

    @Override
    public void open() {
        System.out.println("Opening garage door.");
    }

    @Override
    public void lock() {
        System.out.println("Garage door locked.");
    }

    @Override
    public void unlock() {
        System.out.println("Garage door unlocked.");
    }
}
