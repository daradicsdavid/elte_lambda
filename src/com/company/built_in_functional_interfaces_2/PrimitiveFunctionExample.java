package com.company.built_in_functional_interfaces_2;


import java.util.function.DoubleFunction;
import java.util.function.DoubleToIntFunction;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class PrimitiveFunctionExample {

    public static void doubleFunctionExample() {
        DoubleFunction<Integer> doubleFunction = d -> (int) (d * 2);
    }

    public static void toIntFunctionExample() {
        ToIntFunction<Double> doubleFunction = d -> (int) (d * 2);
    }

    public static void doubleToIntFunctionExample() {
        DoubleToIntFunction doubleFunction = d -> (int) (d * 2);
    }

    public static void shortToByteFunctionExample() {
        ShortToByteFunction shortToByteFunction = s -> (byte) (s * 2);
    }

    @FunctionalInterface
    public interface ShortToByteFunction {

        byte applyAsByte(short s);

    }

}
