package patterns.a_creational.builder;

public class BuilderMain {

    public static void main(String[] args) {

        House house = new House.HouseBuilder("concret", "wooden", "wooden-3-glass", "ceramic")
                .withGarage(true)
                .withSwimmingPool(false)
                .withGarden(true)
                .build();
        System.out.println("--------" + house.getClass().getSimpleName() + "--------");
        System.out.println("Walls: " + house.getWalls());
        System.out.println("Doors: " + house.getDoors());
        System.out.println("Windows: " + house.getWindows());
        System.out.println("Roof: " + house.getRoof());
        System.out.println("Has garage: " + house.isWithGarage());
        System.out.println("Has swimming pool: " + house.isWithSwimmingPool());
        System.out.println("Has garden: " + house.isWithGarden());
    }
}
