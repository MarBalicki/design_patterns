package patterns.b_structural.facade.example1.hidden_bussines_logic;

public class SystemControlFacade {

    private final MainDoor mainDoor;
    private final Blinds blinds;
    private final GarageDoor garageDoor;
    private final GroundFloorLights groundFloorLights;
    private final FirstFloorLights firstFloorLights;

    public SystemControlFacade() {
        this.mainDoor = new MainDoor();
        this.blinds = new Blinds();
        this.garageDoor = new GarageDoor();
        this.groundFloorLights = new GroundFloorLights();
        this.firstFloorLights = new FirstFloorLights();
    }

    public void lockHome() {
        System.out.println("--------LOCK HOME--------");
        groundFloorLights.turnOff();
        firstFloorLights.turnOff();
        mainDoor.close();
        mainDoor.lock();
        blinds.close();
        blinds.lock();
        garageDoor.close();
        garageDoor.lock();
    }

    public void unlockHome() {
        System.out.println("--------UNLOCK HOME--------");
        mainDoor.unlock();
        mainDoor.open();
        blinds.unlock();
        blinds.open();
        garageDoor.unlock();
        garageDoor.open();
        groundFloorLights.turnOn();
    }

    public void lightOn() {
        System.out.println("--------LIGHT ON--------");
        groundFloorLights.turnOn();
        firstFloorLights.turnOn();
    }

    public void lightOff() {
        System.out.println("--------LIGHT OFF--------");
        groundFloorLights.turnOff();
        firstFloorLights.turnOff();
    }
}
