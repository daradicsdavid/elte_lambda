package com.company.stream_4.util;

import java.util.Objects;
import java.util.stream.Stream;

public class Person {
    public final String name;
    public final Integer age;
    public Stream<Card> cards;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equals(person.name) &&
                age.equals(person.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
