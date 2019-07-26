package patterns.Builder.interfaceBuilder;

public class DefaultPerson implements Person {

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
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
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

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    static class Builder extends DefaultPerson {

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
