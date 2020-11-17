package patterns.a_creational.abstract_factory.product;

import patterns.a_creational.abstract_factory.Chair;

public class ArtDecoChair implements Chair {
    @Override
    public void create() {
        System.out.println("Art Deco chair");
    }
}
