package patterns.c_behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ControlTower implements Mediator {

    List<Airplane> airplanes;

    public ControlTower() {
        this.airplanes = new ArrayList<>();
    }

    @Override
    public void sendMessageToOthers(String message, Airplane currentAirplane) {
        for (Airplane airplane : airplanes) {
            if (airplane != currentAirplane) {
                airplane.forwardMessage(currentAirplane.getName() + ": " + message);
            }
        }
    }

    @Override
    public void addAirplane(Airplane airplane) {
        airplanes.add(airplane);
    }
}
