package patterns.b_structural.decorator;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing rectangle");
    }

    @Override
    public void resize() {
        System.out.println("Changing size of rectangle");
    }

    @Override
    public String description() {
        return "Object: rectangle";
    }

    @Override
    public boolean isHidden() {
        return true;
    }
}
