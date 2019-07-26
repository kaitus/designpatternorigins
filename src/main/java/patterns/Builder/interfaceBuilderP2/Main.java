package patterns.Builder.interfaceBuilderP2;

public class Main {

    public static void main(String[] args) {
        Person oldperson = new Person.Builder("james", "bond")
                .phone("007")
                .address("123 abc ")
                .age(25).build();

        System.out.println(oldperson);
    }
}
