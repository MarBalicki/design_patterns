package patterns.a_creational.builder;

import patterns.a_creational.builder.example1.House;
import patterns.a_creational.builder.example2.Nationality;
import patterns.a_creational.builder.example2.Person;

public class BuilderMain {

    public static void main(String[] args) {

        // używamy buildera żeby dostać nowy obiekt zawsze z dobrym stanem i parametrami
        //dla obiektów prostych lepsza jest metoda wytwórcza (factory)

        House house = new House.HouseBuilder("concret", "wooden", "wooden-3-glass", "ceramic")
                .withGarage(true)
//                .withSwimmingPool(false)
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
        System.out.println();

        Person person = new Person.PersonBuilder("Marcin", "Balicki")
                .age(39)
                .idNumber(81121217793L)
                .nationality(Nationality.POLISH)
                .build();
        System.out.println(person);
    }
}
