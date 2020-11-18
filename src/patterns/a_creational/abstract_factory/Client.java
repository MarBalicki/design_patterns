package patterns.a_creational.abstract_factory;

import patterns.a_creational.abstract_factory.factory.ArtDecoFurnitureFactory;
import patterns.a_creational.abstract_factory.factory.ModernFurnitureFactory;
import patterns.a_creational.abstract_factory.factory.VintageFurnitureFactory;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Client {

    private static Factory configureFactory(String factoryStyle) throws Exception {
        Factory factory;
        FurnitureFactory furnitureFactory;
        if (factoryStyle.equalsIgnoreCase("modern")) {
            furnitureFactory = new ModernFurnitureFactory();
            factory = new Factory(furnitureFactory);
        } else if (factoryStyle.equalsIgnoreCase("vintage")) {
            furnitureFactory = new VintageFurnitureFactory();
            factory = new Factory(furnitureFactory);
        } else if (factoryStyle.equalsIgnoreCase("art-deco")) {
            furnitureFactory = new ArtDecoFurnitureFactory();
            factory = new Factory(furnitureFactory);
        } else {
            throw new Exception("There is no such factory style!");
        }
        return factory;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String factoryStyle = "";
        while (true) {
            System.out.println("---------MENU---------\n" +
                    "Product furniture.\n" +
                    "To exit write: exit.\n" +
                    "Pick style - write: modern/vintage/art-deco: ");
            factoryStyle = scanner.nextLine();
            if (factoryStyle.equalsIgnoreCase("exit")) {
                return;
            }
            try {
                Factory factory = configureFactory(factoryStyle);
                factory.createFurniture();
            } catch (Exception e) {
                Logger logger = Logger.getAnonymousLogger();
                logger.log(Level.WARNING, e.getMessage());
            }
        }

    }
}
