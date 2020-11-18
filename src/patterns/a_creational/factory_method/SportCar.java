package patterns.a_creational.factory_method;

public class SportCar extends Car {

    private final String type;
    private final String engine;
    private final String bodyType;
    private final String brand;

    public SportCar() {
        this.type = getClass().getSimpleName();
        this.engine = "3.0 turbo";
        this.bodyType = "coupe";
        this.brand = "Toyota";
    }

    public SportCar(String engine, String bodyType, String brand) {
        this.type = getClass().getSimpleName();
        this.engine = engine;
        this.bodyType = bodyType;
        this.brand = brand;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getEngine() {
        return engine;
    }

    @Override
    public String getBodyType() {
        return bodyType;
    }

    @Override
    public String getBrand() {
        return brand;
    }

}
