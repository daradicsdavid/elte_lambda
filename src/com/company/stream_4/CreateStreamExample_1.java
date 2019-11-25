package com.company.stream_4;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreateStreamExample_1 {

    public static void simpleExample() {
        Stream<Integer> stream = Stream.of(1, 2, 3);
    }

    public static void fromCollectionExample() {

        List<Integer> exampleList = new ArrayList<>();
        exampleList.add(1);
        exampleList.add(2);
        exampleList.add(3);

        Stream<Integer> stream = exampleList.stream();


        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        stream = set.stream();
    }

    public static void arraysExample() {
        Stream<Integer> stream = Arrays.asList(1, 2, 3).stream();

        stream = Arrays.stream(new Integer[]{1, 2, 3});
    }

    public static void primitiveStream() {
        IntStream stream = IntStream.of(1, 2, 3);
        stream = IntStream.range(1, 4);
        stream = IntStream.rangeClosed(1, 3);
    }

}
