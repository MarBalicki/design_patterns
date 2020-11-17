package patterns.a_creational.abstract_factory.product;

import patterns.a_creational.abstract_factory.CoffeeTable;

public class VintageCoffeeTable implements CoffeeTable {
    @Override
    public void create() {
        System.out.println("Vintage coffee table");
    }
}
