package patterns.a_creational.abstract_factory.product;

import patterns.a_creational.abstract_factory.Sofa;

public class ModernSofa implements Sofa {
    @Override
    public void create() {
        System.out.println("Modern sofa");
    }
}
