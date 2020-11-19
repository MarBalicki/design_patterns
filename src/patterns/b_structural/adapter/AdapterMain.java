package patterns.b_structural.adapter;

public class AdapterMain {

    public static void main(String[] args) {

        RoundHole roundHole = new RoundHole(5);
        Circle circle = new Circle(5);
        Square smallSquare = new Square(7);
        Square largeSquare = new Square(7.1);
        //roundHole.fits(smallSquare) won't compile

        SquareAdapter smallSquareAdapter = new SquareAdapter(smallSquare);
        SquareAdapter largeSquareAdapter = new SquareAdapter(largeSquare);
        //adapter and override method solved the problem

        if (roundHole.fits(circle)) {
            System.out.println("Circle with radius " + circle.getRadius()
                    + " fits round hole with radius " + roundHole.getRadius());
        } else {
            System.out.println("Circle with radius " + circle.getRadius()
                    + " not fit into round hole with radius " + roundHole.getRadius());
        }
        if (roundHole.fits(smallSquareAdapter)) {
            System.out.println("Square with width " + smallSquare.getWidth()
                    + " fits round hole with radius " + roundHole.getRadius());
        } else {
            System.out.println("Square with width " + smallSquare.getWidth()
                    + " not fit into round hole with radius " + roundHole.getRadius());
        }
        if (roundHole.fits(largeSquareAdapter)) {
            System.out.println("Square with width " + largeSquare.getWidth()
                    + " fits round hole with radius " + roundHole.getRadius());
        } else {
            System.out.println("Square with width " + largeSquare.getWidth()
                    + " not fit into round hole with radius " + roundHole.getRadius());
        }
    }
}
