package fr.hiit.javatraining.streams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class FlatCollection {

    private FlatCollection() {
    }

    public static List<String> transform7(List<List<String>> collection) {
        List<String> newCollection = new ArrayList<>();
        for (List<String> subCollection : collection) {
            for (String value : subCollection) {
                newCollection.add(value);
            }
        }
        return newCollection;
    }

    public static List<String> transform(List<List<String>> collection) {
        // TODO: implements
        // Convert collection to Stream
        // Replace list with stream
        // Collect results to a new list
        return collection.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

}
