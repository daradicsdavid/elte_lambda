package com.company.functional_interfaces_1;

import java.util.function.Function;

@FunctionalInterface
public interface ElteFunction<T, R> {
    R apply(T variable);

    //Check the original function in java.util.function.Function
    default <V> Function<T, V> andThen(ElteFunction<? super R, ? extends V> var1) {
        return (var2) -> {
            return var1.apply(this.apply(var2));
        };
    }

}
