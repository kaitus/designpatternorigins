package patterns.singleton;

public class MyClass {

    String name;

    //Eagerly creating singlet class
    private static MyClass uniqueInstance = new MyClass();

    private MyClass() {
    }

    public static MyClass getInstance() {
 //       if (uniqueInstance == null) {
 //           uniqueInstance = new MyClass();
 //       }
        return uniqueInstance;
    }
}
