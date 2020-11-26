package patterns.c_behavioral.mediator;

public class AirportMain {

    public static void main(String[] args) {

        ControlTower controlTower = new ControlTower();
        Airplane airplane1 = new Airplane(controlTower, "Air1");
        Airplane airplane2 = new Airplane(controlTower, "Air2");
        Airplane airplane3 = new Airplane(controlTower, "Air3");
        Airplane airplane4 = new Airplane(controlTower, "Air4");
        controlTower.addAirplane(airplane1);
        controlTower.addAirplane(airplane2);
        controlTower.addAirplane(airplane3);
        controlTower.addAirplane(airplane4);

        airplane3.sendMessage("I'm about to land.");


    }
}
