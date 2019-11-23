package com.company.stream_4;

import com.company.stream_4.util.Person;

import java.util.stream.Stream;

public class OrderOfStreamOperations {

    public static void wrongOrder() {
        Stream<Person> personStream = Stream.of(new Person("A", 19), new Person("A2", 21), new Person("C", 15));

        Stream<Person> result = personStream
                .map(p -> new Person(p.name, p.age * 2))
                .filter(p -> p.name.startsWith("A"));
    }

    public static void goodOrder() {
        Stream<Person> personStream = Stream.of(new Person("A", 19), new Person("A2", 21), new Person("C", 15));

        Stream<Person> result = personStream
                .filter(p -> p.name.startsWith("A"))
                .map(p -> new Person(p.name, p.age * 2));
    }
}
