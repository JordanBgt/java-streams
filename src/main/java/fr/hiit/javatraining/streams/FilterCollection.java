package fr.hiit.javatraining.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class FilterCollection {

    private FilterCollection() {
    }

    public static List<String> transform7(List<String> collection) {
        List<String> newCollection = new ArrayList<>();
        for (String element : collection) {
            if (element.length() < 4) {
                newCollection.add(element);
            }
        }
        return newCollection;
    }

    public static List<String> transform(List<String> collection) {
        // TODO: implements
        // Convert collection to Stream
        // Filter elements with length smaller than 4 characters
        // Collect results to a new list
        return collection.stream()
                .filter(x -> x.length() < 4)
                .collect(Collectors.toList());
    }

}
