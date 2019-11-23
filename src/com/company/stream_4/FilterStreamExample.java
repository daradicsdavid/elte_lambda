package com.company.stream_4;

import com.company.stream_4.util.Person;
import org.omg.CORBA.PERSIST_STORE;

import java.util.Optional;
import java.util.stream.Stream;

public class FilterStreamExample {
    public static void filterExample() {
        Stream<Person> personStream = Stream.of(new Person("A", 19), new Person("A2", 21), new Person("C", 15));

        Stream<Person> personStreamAbove18 = personStream.filter(p -> p.age > 18);

        Stream<Person> personStreamAbove18AndNameStartsWithA = personStreamAbove18.filter(p -> p.name.startsWith("A"));


        Stream<Person> result = Stream.of(new Person("A", 19), new Person("A2", 21), new Person("C", 15))
                .filter(p -> p.age > 18)
                .filter(p -> p.name.startsWith("A"));

        result = Stream.of(new Person("A", 19), new Person("A2", 21), new Person("C", 15))
                .filter(p -> p.age > 18 && p.name.startsWith("A"));
    }


    public static void find() {
        Stream<Person> personStream = Stream.of(new Person("A", 19), new Person("A2", 21), new Person("C", 15));
        Optional<Person> first = personStream.filter(p -> p.age > 18).findFirst();

        personStream = Stream.of(new Person("A", 19), new Person("A2", 21), new Person("C", 15));
        Optional<Person> any = personStream.filter(p -> p.name.startsWith("A")).findAny();
    }

    public static void matchExample() {
        boolean anyAboveAge18 = Stream.of(new Person("A", 19), new Person("A2", 21), new Person("C", 15))
                .anyMatch(p -> p.age > 18);
        boolean allAboveAge18 = Stream.of(new Person("A", 19), new Person("A2", 21), new Person("C", 15))
                .allMatch(p -> p.age > 18);
        boolean noneAboveAge18 = Stream.of(new Person("A", 19), new Person("A2", 21), new Person("C", 15))
                .noneMatch(p -> p.age > 18);
    }

}
