package hm3;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John Doe", 30);
        Person.serializePerson(person, "person.dat");
        Person deserializedPerson = Person.deserializePerson("person.dat");
        System.out.println(Objects.requireNonNull(deserializedPerson).name()); // Output: John Doe
        System.out.println(deserializedPerson.age()); // Output: 30
    }
}
