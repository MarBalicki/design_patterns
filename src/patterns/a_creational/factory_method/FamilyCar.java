package patterns.a_creational.factory_method;

public class FamilyCar extends Car {

    private final String type;
    private final String engine;
    private final String bodyType;
    private final String brand;

    public FamilyCar() {
        this.type = getClass().getSimpleName();
        this.engine = "2.0 diesel";
        this.bodyType = "VAN";
        this.brand = "Fiat";
    }

    public FamilyCar(String engine, String bodyType, String brand) {
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
