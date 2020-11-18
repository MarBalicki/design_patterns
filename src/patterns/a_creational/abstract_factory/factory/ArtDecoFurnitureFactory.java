package patterns.a_creational.abstract_factory.factory;

import patterns.a_creational.abstract_factory.Chair;
import patterns.a_creational.abstract_factory.CoffeeTable;
import patterns.a_creational.abstract_factory.FurnitureFactory;
import patterns.a_creational.abstract_factory.Sofa;
import patterns.a_creational.abstract_factory.product.ArtDecoChair;
import patterns.a_creational.abstract_factory.product.ArtDecoCoffeeTable;
import patterns.a_creational.abstract_factory.product.ArtDecoSofa;

public class ArtDecoFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ArtDecoChair();
    }

    @Override
    public Sofa createSofa() {
        return new ArtDecoSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ArtDecoCoffeeTable();
    }
}
