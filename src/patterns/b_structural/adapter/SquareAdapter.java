package patterns.b_structural.adapter;

public class SquareAdapter extends Circle {

    private Square square;

    public SquareAdapter(Square square) {
        this.square = square;
    }

    @Override
    public double getRadius() {
        //Math pattern a circle encircled by a square
        return (square.getWidth() * Math.sqrt(2)) / 2;
    }
}
