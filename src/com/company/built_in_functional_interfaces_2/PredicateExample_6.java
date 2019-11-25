package com.company.built_in_functional_interfaces_2;

import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateExample_6 {
    public static void predicateExample() {
        Predicate<Integer> integerPredicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer n) {
                return n == 0;
            }
        };

        integerPredicate = n -> n == 0;
    }

    public static void intPredicateExample() {
        IntPredicate intPredicate = new IntPredicate() {
            @Override
            public boolean test(int i) {
                return i == 0;
            }
        };

        intPredicate = n -> n == 0;
    }

    public static void biPredicate() {
        BiPredicate<Integer, String> biPredicate = new BiPredicate<Integer, String>() {
            @Override
            public boolean test(Integer i, String s) {
                return i == s.length();
            }
        };

        biPredicate = (i, s) -> i == s.length();
    }

}
