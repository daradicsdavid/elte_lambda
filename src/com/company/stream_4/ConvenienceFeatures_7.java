package com.company.stream_4;

import com.company.stream_4.util.Person;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class ConvenienceFeatures_7 {

    public static void count() {
        Stream<Person> personStream = Stream.of(new Person("A", 19), new Person("A2", 21), new Person("C", 15));
        long count = personStream.count();
    }

    public static void distinct() {
        Stream<Person> personStream = Stream.of(new Person("A", 19), new Person("A2", 21), new Person("C", 15));
        Stream<Person> distinctPersonStream = personStream.distinct();
    }

    public static void limit() {
        Stream<Person> personStream = Stream.of(new Person("A", 19), new Person("A2", 21), new Person("C", 15));
        Stream<Person> limit = personStream.limit(1); //Only one element
    }

    public static void compare() {
        Stream<Person> personStream = Stream.of(new Person("A", 19), new Person("A2", 21), new Person("C", 15));
        Optional<Person> min = personStream.min((p, p2) -> p.age.compareTo(p2.age));
        Optional<Person> max = personStream.max(Comparator.comparing(p -> p.age));
    }

    public static void sorted() {
        Stream<Person> personStream = Stream.of(new Person("A", 19), new Person("A2", 21), new Person("C", 15));
        Stream<Person> sorted = personStream.sorted((p, p2) -> p.age.compareTo(p2.age));
    }


}
