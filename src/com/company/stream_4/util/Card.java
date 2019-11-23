package com.company.stream_4.util;

public class Card {
    private final String name;
    private final Integer age;

    public Card(Person p) {
        this.name = p.name;
        this.age = p.age;
    }
}
