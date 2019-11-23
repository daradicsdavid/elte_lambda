package com.company.optional_3;

import java.util.Optional;
import java.util.function.Predicate;

public class OptionalExample {

    public static void optionalExample() {
        Optional<Integer> optional = Optional.empty();

        boolean present = optional.isPresent(); //False

        optional = Optional.of(1);

        present = optional.isPresent(); //True
    }

    public static void optionalGetExample() throws Exception {
        Optional<Integer> optional = Optional.of(1);

        Integer result = optional.get();

        result = optional.orElse(1);
        //Supplier!
        result = optional.orElseGet(() -> 1);

        //Supplier!
        optional.orElseThrow(Exception::new);
    }

    public static void optionalMap() {
        Optional<Integer> optional = Optional.of(1);

        Optional<Optional<String>> s = optional.map(o -> Optional.of(o.toString()));
        Optional<String> s2 = optional.flatMap(o -> Optional.of(o.toString()));
    }

    public static void optionalFilter() {
        Optional<Integer> optional = Optional.of(1);

        if (optional.isPresent() && optional.get() == 1) {
            Optional<Integer> filtered = optional;
        }

        //Predicate
        Optional<Integer> filteredOptional = optional.filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer == 1;
            }
        });

        optional.filter(i -> i == 1);
    }

}
