package com.company.stream_4;

import com.company.stream_4.util.Person;

import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class ReduceStreamExample_4 {
    public static void reduce() {
        Stream<Integer> integerStream = Stream.of(1, 2, 3);

        Optional<Integer> min = integerStream.reduce(
                (i, j) -> {
                    if (i < j) return i;
                    return j;
                });

        Optional<Integer> max = integerStream.reduce(
                (i, j) -> i < j ? j : i);
    }

    public static void reduceWithAccumulator() {
        Stream<Integer> integerStream = Stream.of(1, 2, 3);

        BinaryOperator<Integer> combinator = (i, j) -> i + j;
        Integer sum = integerStream.reduce(0, combinator);
    }

    public static void reduceWithAccumulatorAndCombinator() {
        Stream<Person> personStream = Stream.of(new Person("A", 19), new Person("A2", 21), new Person("C", 15));

        BiFunction<Integer, Person, Integer> accumulator = (i, p) -> i + p.age;
        BinaryOperator<Integer> combinator = (i, j) -> i + j;
        Integer sum = personStream.reduce(0, accumulator, combinator);
    }
}
