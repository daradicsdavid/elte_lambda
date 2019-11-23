package com.company.functional_interfaces_1;

public class FunctionalInterfaceExample {

    Integer value = 1;

    public static void functionalInterfaceExample() {
        SimpleFunctionalInterface terrible = new SimpleFunctionalInterface() {
            @Override
            public void call() {
                System.out.println("Hello World");
            }
        };

        SimpleFunctionalInterface i = () -> {
            System.out.println("Hello World");
        };


        i.call();
    }

    public static void functionExample() {

        // (Integer v) -> (v) -> v
        // { return v * 2  } -> v * 2
        ElteFunction<Integer, Integer> multipleByTwo = (Integer v) -> {
            return v * 2;
        };

        // ElteFunction<String, String> toLowerCase = (s) -> s.toLowerCase();
        ElteFunction<String, String> toLowerCase = String::toLowerCase;
    }

    public static void functionWithDefaultExample() {
        Integer n = 3;
        ElteFunction<Integer, Integer> multipleByThree = v -> v * n;

        multipleByThree.andThen(multipleByThree).apply(n); // 3 * 3 * 3
    }

    public void scopeExample() {

        ElteFunction<Integer, Integer> function = new ElteFunction<Integer, Integer>() {
            private Integer value = 1;

            @Override
            public Integer apply(Integer variable) {
                return this.value * variable;
            }
        };

        ElteFunction<Integer, Integer> function2 = (n) -> n * this.value;
    }

    public void finalVariableExample() {

        Integer a = 1;
        ElteFunction<Integer, Integer> example = (n) -> {
//            a = 2;  a should be final or 'effectively' final (Thread safety)
            return n;
        };
    }

}
