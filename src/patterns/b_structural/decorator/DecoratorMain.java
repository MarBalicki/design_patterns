package patterns.b_structural.decorator;

public class DecoratorMain {

    public static void main(String[] args) {

        System.out.println("Building simple shape objects...");
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();
        System.out.println("Drawing simple shape objects...");
        triangle.draw();
        rectangle.draw();
        System.out.println("Building decorated red triangle with blue " +
                "contour in dash style and line thickness 2...");
        Shape decoratedTriangle = new FillColorDecorator(
                new LineColorDecorator(
                        new LineStyleDecorator(
                                new LineThicknessDecorator(
                                        new Triangle(), 2.0
                                ), LineStyle.DASH
                        ), Color.BLUE
                ), Color.RED
        );

        decoratedTriangle.draw();
        System.out.println(decoratedTriangle.description());
        System.out.println();

        Rectangle rectangle1 = new Rectangle();
        LineStyleDecorator ls = new LineStyleDecorator(rectangle1, LineStyle.SOLID);
        LineColorDecorator lc = new LineColorDecorator(ls, Color.RED);
        Shape decoratedRectangle = new FillColorDecorator(lc, Color.BLACK);
        decoratedRectangle.draw();
        System.out.println("Object hidden: " + decoratedRectangle.isHidden());
        System.out.println(decoratedRectangle.description());

    }
}
