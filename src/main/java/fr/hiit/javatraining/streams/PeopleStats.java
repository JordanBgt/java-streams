package fr.hiit.javatraining.streams;

import java.util.IntSummaryStatistics;
import java.util.List;

public class PeopleStats {

    private PeopleStats() {
    }

    public static Stats getStats7(List<Person> people) {
        long sum = 0;
        int min = people.get(0).getAge();
        int max = 0;
        for (Person person : people) {
            int age = person.getAge();
            sum += age;
            min = Math.min(min, age);
            max = Math.max(max, age);
        }
        return new Stats(people.size(), sum, min, max);
    }

    public static IntSummaryStatistics getStats(List<Person> people) {
        // TODO: implements
        return people.stream()
                .mapToInt(Person::getAge)
                .summaryStatistics();
    }

}
