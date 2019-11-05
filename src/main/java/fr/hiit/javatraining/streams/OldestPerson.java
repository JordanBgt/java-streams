package fr.hiit.javatraining.streams;

import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class OldestPerson {

    public static Person getOldestPerson7(List<Person> people) {
        Person oldestPerson = new Person("", 0, null);
        for (Person person : people) {
            if (person.getAge() > oldestPerson.getAge()) {
                oldestPerson = person;
            }
        }
        return oldestPerson;
    }

    public static Person getOldestPerson(List<Person> people) {
        // TODO: implements
        // Convert collection to Stream
        // Compares people ages
        // Gets stream result
        return people.stream()
                .max(Comparator.comparing(Person::getAge))
                .orElseThrow(NoSuchElementException::new);
    }

}
