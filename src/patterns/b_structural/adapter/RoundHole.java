package patterns.b_structural.adapter;

public class RoundHole {

    private final double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(Circle circle) {
        return this.getRadius() >= circle.getRadius();
    }
}
