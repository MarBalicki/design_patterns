package patterns.c_behavioral.strategy.example2;

import java.util.Scanner;

public class Device {

    public static void getTravelWay(NavigationContext navigationContext, Scanner scanner) {
        boolean rightChoice = false;
        do {
            System.out.println("Pick travel way: \n1. By car\n2. By bicycle\n3. On foot");
            String travelWay = scanner.nextLine();
            switch (travelWay) {
                case "1":
                    navigationContext.setTravelWay(new CarNavigation());
                    break;
                case "2":
                    navigationContext.setTravelWay(new BicycleNavigation());
                    break;
                case "3":
                    navigationContext.setTravelWay(new OnFootNavigation());
                    break;
                default:
                    System.out.println("Wrong choice, try again.");
                    break;
            }
            if (navigationContext.getNavigation() != null) {
                rightChoice = true;
            }
        } while (!rightChoice);
    }
}
