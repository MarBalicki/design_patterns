package patterns.a_creational.abstract_factory.product;

import patterns.a_creational.abstract_factory.CoffeeTable;

public class ArtDecoCoffeeTable implements CoffeeTable {
    @Override
    public void create() {
        System.out.println("Art Deco coffee table");
    }
}
