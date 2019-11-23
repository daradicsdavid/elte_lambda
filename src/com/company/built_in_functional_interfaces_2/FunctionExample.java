package com.company.built_in_functional_interfaces_2;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class FunctionExample {

    public static void example() {
        Map<String, Integer> nameMap = new HashMap<>();


        if (!nameMap.containsKey("John")) {
            nameMap.put("John", "John".length());
        }
        Integer value = nameMap.get("John");


        Function<String, Integer> function = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };
        value = nameMap.computeIfAbsent("John", function);


        Function<String, Integer> function2 = s -> s.length();
        value = nameMap.computeIfAbsent("John", function2);

        Function<String, Integer> function3 = String::length;
        value = nameMap.computeIfAbsent("John", function3);


        //Integer value = nameMap.computeIfAbsent("John", String::length);
        value = nameMap.computeIfAbsent("John", String::length);

    }
}
