package patterns.Builder.simpleBuiler;

public class Main {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();
        builder.append("hello world")
                .append(" i dont know")
                .append(" this is the end!");
        System.out.println(builder);

        User james = new User.UserBuilder("James", "Bond")
                .address("123, London")
                .age(45)
                .phoneNumber("007")
                .build();
        System.out.println(james);
    }
}
