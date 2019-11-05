package fr.hiit.javatraining.streams;

import java.util.List;
import java.util.NoSuchElementException;

public class Sum {

    private Sum() {
    }

    public static int calculate7(List<Integer> numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    public static int calculate(List<Integer> people) {
        // TODO: implements
        // Convert collection to Stream
        // Sum elements with 0 as starting value
        return people.stream()
                .reduce(Integer::sum)
                .orElseThrow(NoSuchElementException::new);
    }

}
