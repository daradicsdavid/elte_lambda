package com.company.stream_4;

import com.company.stream_4.util.Card;
import com.company.stream_4.util.Person;

import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class MapStreamExample_3 {

    public static void mapToObjectExample() {
        IntStream integerStream = IntStream.of(1, 2, 3);
        Stream<Person> personStream = integerStream.mapToObj(i -> new Person("Name", i));
    }

    public static void mapToPrimitive() {
        Stream<Person> personStream = Stream.of(new Person("Name", 1), new Person("Name", 2), new Person("Name", 3));

        IntStream stream = personStream.mapToInt(p -> p.age);
        LongStream longStream = personStream.mapToLong(p -> p.age);
    }

    public static void mapExample() {
        Stream<Person> personStream = Stream.of(new Person("Name", 1), new Person("Name", 2), new Person("Name", 3));

//                                                 Card::new
        Stream<Card> cardStream = personStream.map(p -> new Card(p));
    }

    public static void flatMapExample() {
        Stream<Person> personStream = Stream.of(new Person("Name", 1), new Person("Name", 2), new Person("Name", 3));
        personStream.forEach(p -> p.cards = Stream.of(new Card(p), new Card(p)));

        //Has 4 cards
        Stream<Card> cardStream = personStream.flatMap(p -> p.cards);
    }
}
