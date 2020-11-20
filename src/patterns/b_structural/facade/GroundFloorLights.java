package patterns.b_structural.facade;

public class GroundFloorLights implements Light {

    @Override
    public void turnOn() {
        System.out.println("Turn on lights on ground floor.");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn off lights on ground floor.");
    }
}
