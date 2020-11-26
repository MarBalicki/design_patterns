package patterns.c_behavioral.mediator;

public interface Mediator {

    void sendMessageToOthers(String message, Airplane airplane);
    void addAirplane(Airplane airplane);
}
