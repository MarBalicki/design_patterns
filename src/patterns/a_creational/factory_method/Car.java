package patterns.a_creational.factory_method;

public abstract class Car {

    public abstract String getType();

    public abstract String getEngine();

    public abstract String getBodyType();

    public abstract String getBrand();

    @Override
    public String toString() {
        return "Type: " + getType()
                + "\nEngine: " + getEngine()
                + "\nBody type: " + getBodyType()
                + "\nBrand: " + getBrand();
    }
}
