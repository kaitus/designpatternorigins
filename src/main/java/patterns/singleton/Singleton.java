package patterns.singleton;

public class Singleton {

    //private static Singleton uniqueInstance = new Singleton();

    private volatile static Singleton uniqueInstance;
    String name;

    public Singleton() {
    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized ( (Singleton.class)) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
