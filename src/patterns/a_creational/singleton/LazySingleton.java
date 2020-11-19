package patterns.a_creational.singleton;

public class LazySingleton {

    private static LazySingleton instance;
    public String value;

    private LazySingleton(String value) {
        this.value = value;
    }

    public static LazySingleton getInstance(String value) {
        if (instance == null) {
            instance = new LazySingleton(value);
        }
        return instance;
    }
}
