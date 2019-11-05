package fr.hiit.javatraining.streams;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Partitioning {

    private Partitioning() {
    }

    public static Map<Boolean, List<Person>> partitionAdults7(List<Person> people) {
        Map<Boolean, List<Person>> map = new HashMap<>();
        map.put(true, new ArrayList<>());
        map.put(false, new ArrayList<>());
        for (Person person : people) {
            map.get(person.getAge() >= 18).add(person);
        }
        return map;
    }

    public static Map<Boolean, List<Person>> partitionAdults(List<Person> people) {
        // TODO: implements
        // Convert collection to Stream
        // Partition stream of people into adults (age => 18) and kids
        return people.stream()
                .collect(Collectors.partitioningBy(x -> x.getAge() > 18));
    }

}
