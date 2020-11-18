package patterns.a_creational.abstract_factory.factory;

import patterns.a_creational.abstract_factory.Chair;
import patterns.a_creational.abstract_factory.CoffeeTable;
import patterns.a_creational.abstract_factory.FurnitureFactory;
import patterns.a_creational.abstract_factory.Sofa;
import patterns.a_creational.abstract_factory.product.VintageChair;
import patterns.a_creational.abstract_factory.product.VintageCoffeeTable;
import patterns.a_creational.abstract_factory.product.VintageSofa;

public class VintageFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VintageChair();
    }

    @Override
    public Sofa createSofa() {
        return new VintageSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new VintageCoffeeTable();
    }
}
