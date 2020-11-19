package patterns.b_structural.decorator;

public class Triangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Drawing triangle");
    }

    @Override
    public void resize() {
        System.out.println("Changing size of triangle");
    }

    @Override
    public String description() {
        return "Object: triangle";
    }

    @Override
    public boolean isHidden() {
        return false;
    }
}
