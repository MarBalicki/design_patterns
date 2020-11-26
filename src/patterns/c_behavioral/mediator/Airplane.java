package patterns.c_behavioral.mediator;

public class Airplane {

    private final ControlTower controlTower;
    private final String name;

    public Airplane(ControlTower controlTower, String name) {
        this.controlTower = controlTower;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sendMessage(String message) {
        System.out.println(this.getClass().getSimpleName()
                + " " + this.name + " sending message: '" + message + "'");
        controlTower.sendMessageToOthers(message, this);
    }

    public void forwardMessage(String message) {
        System.out.println(this.getClass().getSimpleName()
                + " " + this.name + " received message: '" + message + "'");
    }

}
