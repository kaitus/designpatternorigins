package patterns.Builder.interfaceBuilderP2;

public interface Person {


    String getFirstName();

    String getLastName();

    String getPhoneNumber();

    int getAge();

    String getAddress();

    class DefaultPerson implements Person {

        private final String firstName;
        private final String lastName;
        public int age;
        public String phoneNumber;
        public String address;

        public DefaultPerson(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public DefaultPerson(Builder builder) {
            this(builder.getFirstName(), builder.getLastName());
            this.age = builder.age;
            this.phoneNumber = builder.phoneNumber;
            this.address = builder.address;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public int getAge() {
            return this.age;
        }

        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public String getAddress() {
            return this.address;
        }

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();
            builder.append("Name: " + this.firstName + " " + this.lastName);
            builder.append(" Phone: " + this.phoneNumber );
            builder.append(" Address: " + this.address);
            builder.append(" Age: " + this.age);
            return builder.toString();
        }
    }

    class Builder extends DefaultPerson {

        public Builder(String firstName, String lastName) {
            super(firstName, lastName);
        }

        public Builder phone(String phone) {
            this.phoneNumber = phone;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Person build() {
            return new DefaultPerson(this);
        }
    }
}
