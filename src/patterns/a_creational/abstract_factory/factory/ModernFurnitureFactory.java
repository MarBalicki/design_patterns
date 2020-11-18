package patterns.a_creational.abstract_factory.factory;

import patterns.a_creational.abstract_factory.Chair;
import patterns.a_creational.abstract_factory.CoffeeTable;
import patterns.a_creational.abstract_factory.FurnitureFactory;
import patterns.a_creational.abstract_factory.Sofa;
import patterns.a_creational.abstract_factory.product.ModernChair;
import patterns.a_creational.abstract_factory.product.ModernCoffeeTable;
import patterns.a_creational.abstract_factory.product.ModernSofa;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ModernCoffeeTable();
    }
}
