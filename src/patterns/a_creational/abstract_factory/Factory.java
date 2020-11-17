package patterns.a_creational.abstract_factory;

public class Factory {
    private final Chair chair;
    private final Sofa sofa;
    private final CoffeeTable coffeeTable;

    public Factory(FurnitureFactory furnitureFactory) {
        this.chair = furnitureFactory.createChair();
        this.sofa = furnitureFactory.createSofa();
        this.coffeeTable = furnitureFactory.createCoffeeTable();
    }

    void createFurniture() {
        chair.create();
        sofa.create();
        coffeeTable.create();
    }
}
