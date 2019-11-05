package fr.hiit.javatraining.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class ToUpperCase {

    private ToUpperCase() {
    }

    public static List<String> transform7(List<String> collection) {
        List<String> newCollection = new ArrayList<>();
        for (String element : collection) {
            newCollection.add(element.toUpperCase());
        }
        return newCollection;
    }

    public static List<String> transform(List<String> collection) {
        // TODO: implements
        // Convert collection to Stream
        // Convert each element to upper case
        // Collect results to a new list
        return collection
                .stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

}
