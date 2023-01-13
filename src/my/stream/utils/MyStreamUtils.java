package my.stream.utils;

import java.util.*;
import java.util.stream.*;

public class MyStreamUtils {

    private MyStreamUtils() {
        throw new IllegalStateException("Utility class");
    }

    public static String oddIndexNamesGet(List<String> names) {

        return names.stream()
                .filter(name -> names.indexOf(name) % 2 == 1)
                .map(name -> names.indexOf(name) + ". " + name)
                .collect(Collectors.joining(", "));
    }

    public static List<String> upperCaseAndReversSort(List<String> names) {

        return names.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

    public static String weirdArraysNumbersGetAndSort(String[] numbers) {

        return Arrays.stream(numbers)
                .map(number -> number.split(", "))
                .flatMap(Arrays::stream)
                .sorted()
                .collect(Collectors.joining(", ", "\"", "\""));
    }

    public static void linearCongruentialGeneration(long firstX) {

        LCG r = new LCG(firstX);
        LongStream.iterate(firstX, (seed) -> r.next())
                .forEach(System.out::println);
    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {

        List<T> f = first.collect(Collectors.toList());
        List<T> s = second.collect(Collectors.toList());

        return Stream.of(f, s)
                .flatMap(List::stream)
                .sorted(Comparator.comparingInt(it -> f.indexOf(it) + s.indexOf(it)))
                .limit(f.size() >= s.size() ? s.size() * 2L : f.size() * 2L);
    }
}
