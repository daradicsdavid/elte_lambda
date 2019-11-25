package com.company.built_in_functional_interfaces_2;

import java.util.function.BiFunction;
import java.util.function.ToIntBiFunction;

public class BiFunctionExample_2 {
    public static void biFunctionExample() {
        BiFunction<Long, Double, Integer> add = (i, d) -> i.intValue() + d.intValue();
    }

    public static void toIntBiFunctionExample() {
        ToIntBiFunction<Long, Double> add = (i, d) -> i.intValue() + d.intValue();
    }
}
