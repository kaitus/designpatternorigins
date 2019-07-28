package patterns.prototype.model;

public class Person implements Animal {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person is creating!");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person: " + name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal clone() {
        System.out.println("Creating person...");
        Person person = null;
        try {
            person = (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return person;
    }
}
