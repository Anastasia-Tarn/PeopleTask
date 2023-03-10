public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String address;


    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (age < 0 || age > 105) {
            throw new IllegalArgumentException("The age is incorrect");
        } else if (name == null || surname == null) {
            throw new IllegalStateException("The data is not enough");
        }
        return new Person(name, surname, address, age);
    }
}