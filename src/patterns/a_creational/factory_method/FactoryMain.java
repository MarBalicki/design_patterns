package patterns.a_creational.factory_method;

import java.util.Scanner;

public class FactoryMain {

    public static Car getCar(String type) {
        if (type.equalsIgnoreCase("sport")) {
            return new SportCar();
        } else if (type.equalsIgnoreCase("family")) {
            return new FamilyCar();
        } else if (type.equalsIgnoreCase("utility")) {
            return new UtilityCar();
        }
        throw new IllegalArgumentException("Our factory not produce car type: " + type
                + ".\nWe can change this :)");
    }

    public static Car getCar(String type, String engine, String bodyType, String brand) {
        if (type.equalsIgnoreCase("sport")) {
            return new SportCar(engine, bodyType, brand);
        } else if (type.equalsIgnoreCase("family")) {
            return new FamilyCar(engine, bodyType, brand);
        } else if (type.equalsIgnoreCase("utility")) {
            return new UtilityCar(engine, bodyType, brand);
        }
        throw new IllegalArgumentException("Our factory not produce car type: " + type
                + ".\nWe can change this :)");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String type = "";
        while (true) {
            System.out.println("---------MENU---------"
                    + "\nProduce car."
                    + "\nPick type, write: sport/family/utility"
                    + "\nTo produce own, write: own"
                    + "\nTo exit write: exit");
            type = scanner.nextLine();
            if (type.equalsIgnoreCase("exit")) {
                return;
            } else if (type.equalsIgnoreCase("own")) {
                try {
                    System.out.println("Type - sport/family/utility: ");
                    String carType = scanner.nextLine();
                    System.out.println("Engine: ");
                    String engine = scanner.nextLine();
                    System.out.println("Body style: ");
                    String bodyStyle = scanner.nextLine();
                    System.out.println("Brand: ");
                    String brand = scanner.nextLine();
                    Car ownCar = getCar(carType, engine, bodyStyle, brand);
                    System.out.println(ownCar);
                } catch (IllegalArgumentException e) {
                    System.out.println(e);
                }
            } else {
                try {
                    Car car = getCar(type);
                    System.out.println(car);
                } catch (IllegalArgumentException e) {
                    System.out.println(e);
                }
            }
        }

    }
}
