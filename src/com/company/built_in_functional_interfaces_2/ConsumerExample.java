package com.company.built_in_functional_interfaces_2;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample {
    public static void consumerExample() {
        Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };

        consumer = i -> System.out.println(i);

        consumer = System.out::println;
    }

    public static void intConsumerExample() {
        IntConsumer consumer = System.out::println;
    }

    public static void biConsumerExample() {
        BiConsumer<String, Integer> biConsumer = new BiConsumer<String, Integer>() {
            @Override
            public void accept(String s, Integer i) {
                System.out.println(s + i);
            }
        };

        biConsumer = (s, i) -> System.out.println(s + i);
    }

    public static void objIntConsumerExample() {
        ObjIntConsumer<String> stringObjIntConsumer = new ObjIntConsumer<String>() {
            @Override
            public void accept(String s, int i) {
                System.out.println(s + i);
            }
        };

        stringObjIntConsumer = (s, i) -> System.out.println(s + i);
    }
}
