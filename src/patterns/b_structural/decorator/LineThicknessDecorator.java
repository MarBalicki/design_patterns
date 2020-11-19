package patterns.b_structural.decorator;

public class LineThicknessDecorator extends ShapeDecorator {

    protected double thickness;

    public LineThicknessDecorator(Shape decoratedShape, double thickness) {
        super(decoratedShape);
        this.thickness = thickness;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        System.out.println("Line thickness: " + thickness);
    }

    @Override
    public void resize() {
        decoratedShape.resize();
    }

    @Override
    public String description() {
        return decoratedShape.description() + " with line thickness " + thickness + ".";
    }

    @Override
    public boolean isHidden() {
        return decoratedShape.isHidden();
    }
}
