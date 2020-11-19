package patterns.a_creational.singleton;

public class SingletonMain {

    public static void main(String[] args) {

        LazySingleton firstLazySingleton = LazySingleton.getInstance("YEA");
        LazySingleton secondLazySingleton = LazySingleton.getInstance("BOO");
        System.out.println("Started: " + firstLazySingleton.getClass().getSimpleName());
        System.out.println("value first: " + firstLazySingleton.value);
        System.out.println("value second: " + secondLazySingleton.value);
        System.out.println("----------------------------------------");

        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        System.out.println("Started: " + eagerSingleton.getClass().getSimpleName());
        System.out.println("hash: " + eagerSingleton.hashCode());
        EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
        System.out.println("Started: " + eagerSingleton1.getClass().getSimpleName());
        System.out.println("hash: " + eagerSingleton1.hashCode());

        System.out.println("----------------------------------------"
                + "\nIf You see same value it meas that singleton was reused :)"
                + "\nIf You see different values, the second singleton was created :("
                + "\nIt's naive implementation, because there is no synchronized singleton class."
                + "\nWith many threads could not work.");
    }
}
