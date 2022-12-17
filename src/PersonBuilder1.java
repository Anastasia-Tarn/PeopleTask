public class PersonBuilder1 {
    private String name;
    private String surname;
    private int age;
    private String address;


    public PersonBuilder1 setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder1 setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder1 setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder1 setAddress(String address) {
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