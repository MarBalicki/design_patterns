package patterns.b_structural.decorator;

public class LineStyleDecorator extends ShapeDecorator {

    protected LineStyle lineStyle;

    public LineStyleDecorator(Shape decoratedShape, LineStyle lineStyle) {
        super(decoratedShape);
        this.lineStyle = lineStyle;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        System.out.println("Line style: " + lineStyle);
    }

    @Override
    public void resize() {
        decoratedShape.resize();
    }

    @Override
    public String description() {
        return decoratedShape.description() + " draw with " + lineStyle + " line style.";
    }

    @Override
    public boolean isHidden() {
        return decoratedShape.isHidden();
    }
}
