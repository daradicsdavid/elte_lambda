package com.company.built_in_functional_interfaces_2;

import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class OperatorExample_3 {

    public static void unaryOperatorExample() {
        UnaryOperator<Integer> unaryOperator = new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer * 2;
            }
        };
        unaryOperator = n -> n * 2;
    }

    public static void intUnaryOperatorExample() {
        IntUnaryOperator unaryOperator = new IntUnaryOperator() {
            @Override
            public int applyAsInt(int i) {
                return i * 2;
            }
        };

        unaryOperator = n -> n * 2;
    }

    public static void binaryOperatorExample() {
        BinaryOperator<Integer> binaryOperator = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer + integer2;
            }
        };

        binaryOperator = (i, i2) -> i + i2;
        binaryOperator = Integer::sum;
    }

    public static void intBinaryOperatorExample() {
        IntBinaryOperator intBinaryOperator = new IntBinaryOperator() {
            @Override
            public int applyAsInt(int i, int i1) {
                return i + i1;
            }
        };

        intBinaryOperator = (i, i1) -> i + i1;
        intBinaryOperator = Integer::sum;
    }
}
