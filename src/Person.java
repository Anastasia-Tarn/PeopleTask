import java.util.Optional;
import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected String address;
    protected int age;

    Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    Person(String name, String surname, String address, int age) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.age = age;
    }

    public boolean hasAge() {
        if (age != 0) {
            return true;
        }
        return false;
    }

    public boolean hasAddress() {
        if (address != null) {
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public OptionalInt getAge() {
        return OptionalInt.of(age);
    }

    public Optional<String> getAddress() {
        return Optional.of(address);
    }


    public void happyBirthday() {
        age++;
    }

    @Override
    public String toString() {
        return name + " " + surname + " . Возраст " + age + ". Адрес: " + address + " ";
    }

    @Override
    public int hashCode() {
        return name.hashCode() + surname.hashCode();
    }

    public PersonBuilder1 newChildBuilder() {
        return new PersonBuilder1()
                .setSurname(surname)
                .setAge(3)
                .setAddress(address);
    }


}




