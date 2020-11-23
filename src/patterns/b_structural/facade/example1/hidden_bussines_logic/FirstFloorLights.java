package patterns.b_structural.facade.example1.hidden_bussines_logic;

class FirstFloorLights implements Light {

    @Override
    public void turnOn() {
        System.out.println("Turn on lights on 1st floor.");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn off lights on 1st floor.");
    }
}
