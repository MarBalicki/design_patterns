package patterns.b_structural.facade.example1.hidden_bussines_logic;

class Blinds implements Door {

    @Override
    public void close() {
        System.out.println("Closing blinds.");
    }

    @Override
    public void open() {
        System.out.println("Opening blinds.");
    }

    @Override
    public void lock() {
        System.out.println("Blinds locked.");
    }

    @Override
    public void unlock() {
        System.out.println("Blinds unlocked.");
    }
}
