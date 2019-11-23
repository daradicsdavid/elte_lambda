package com.company.built_in_functional_interfaces_2;

import java.util.function.IntSupplier;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExample {

    public static void simpleSupplier() {
        Supplier<Integer> supplier = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return 1;
            }
        };

        supplier = () -> 1;
    }

    public static void intSupplier() {
        IntSupplier supplier = () -> 1;
    }


    public static void fibonacciSupplier() {
        int[] fibs = {0, 1};

        Supplier<Integer> supplier = () -> {
            int result = fibs[1];
            int fib3 = fibs[0] + fibs[1];
            fibs[0] = fibs[1];
            fibs[1] = fib3;
            return result;
        };
    }


}
