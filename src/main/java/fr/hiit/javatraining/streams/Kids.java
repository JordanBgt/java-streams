package fr.hiit.javatraining.streams;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toSet;

public class Kids {

    public static Set<String> getKidNames7(List<Person> people) {
        Set<String> kids = new HashSet<>();
        for (Person person : people) {
            if (person.getAge() < 18) {
                kids.add(person.getName());
            }
        }
        return kids;
    }

    public static Set<String> getKidNames(List<Person> people) {
        // TODO: implements
        // Filter kids (under age of 18)
        // Map Person elements to names
        // Collect values to a Set
        return people.stream()
                .filter(x -> x.getAge() < 18)
                .map(Person::getName)
                .collect(Collectors.toSet());
    }

}
