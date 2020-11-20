package patterns.b_structural.facade;

public class FacadeUser {

    public static void main(String[] args) {

        SystemControl systemControl = new SystemControl();
        systemControl.lockHome();
        System.out.println("--------------");
        systemControl.unlockHome();
        System.out.println("--------------");
        systemControl.lightOn();
        System.out.println("--------------");
        systemControl.lightOff();
    }
}
