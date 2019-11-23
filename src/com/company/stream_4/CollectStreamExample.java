package com.company.stream_4;

import com.company.stream_4.util.Person;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectStreamExample {
    public static void toCollection() {
        Stream<Person> personStream = Stream.of(new Person("A", 19), new Person("A2", 21), new Person("C", 15));

        List<Person> list = personStream.collect(Collectors.toList());
        Set<Person> set = personStream.collect(Collectors.toSet());
        Map<String, Integer> map = personStream.collect(Collectors.toMap(
                p -> p.name,
                p -> p.age));
    }

    public static void groupBy() {
        Stream<Person> personStream = Stream.of(new Person("A", 19), new Person("A2", 21), new Person("C", 15));

        Map<Integer, List<Person>> collect = personStream.collect(Collectors.groupingBy(p -> p.age));
//        Map<String, List<Person>> collect1 = personStream.collect(Collectors.groupingBy(p -> p.name));
    }

}
