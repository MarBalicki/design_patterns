package patterns.b_structural.facade;

public class SystemControl {

    private final MainDoor mainDoor = new MainDoor();
    private final Blinds blinds = new Blinds();
    private final GarageDoor garageDoor = new GarageDoor();
    private final GroundFloorLights groundFloorLights = new GroundFloorLights();
    private final FirstFloorLights firstFloorLights = new FirstFloorLights();

    void lockHome() {
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

    void unlockHome() {
        System.out.println("--------UNLOCK HOME--------");
        mainDoor.unlock();
        mainDoor.open();
        blinds.unlock();
        blinds.open();
        garageDoor.unlock();
        garageDoor.open();
        groundFloorLights.turnOn();
    }

    void lightOn() {
        System.out.println("--------LIGHT ON--------");
        groundFloorLights.turnOn();
        firstFloorLights.turnOn();
    }

    void lightOff() {
        System.out.println("--------LIGHT OFF--------");
        groundFloorLights.turnOff();
        firstFloorLights.turnOff();
    }
}
