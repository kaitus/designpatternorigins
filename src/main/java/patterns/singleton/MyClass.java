package patterns.singleton;

public class MyClass {

    String name;

    private static MyClass uniqueInstance;

    private MyClass() {
    }

    public static synchronized MyClass getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new MyClass();
        }
        return uniqueInstance;
    }
}
