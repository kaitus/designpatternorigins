package patterns.prototype;

public class Main {

    public static void main(String[] args) {

        /**
         * EJERCICIO #1
         */
        System.out.println("EJERCICIO #1");
        Person bonni = new Person("Bonni", 21);
        System.out.println("Person1: " + bonni);

        Person nina = (Person) bonni.clone();
        nina.setName("nina");
        System.out.println("Person2: " + nina);

        Dolphin jerry = new Dolphin("Jerry", 18);
        System.out.println("Dolfin 1: " + jerry);

        Dolphin sam = (Dolphin) jerry.clone();
        System.out.println("Dolfin 2: " + sam);

        /**
         * EJERCICIO #2
         */
        System.out.println("EJERCICIO #2");
        patterns.prototype.model.Person person1 = new patterns.prototype.model.Person("James", 45);
        System.out.println("Person: " + person1);

        patterns.prototype.model.Person person2 = (patterns.prototype.model.Person) person1.clone();
        System.out.println("Person copy: " + person2);

        System.out.println(System.identityHashCode(person1) + "\n" + System.identityHashCode(person2));

    }
}
