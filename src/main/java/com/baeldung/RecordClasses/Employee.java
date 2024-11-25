package com.baeldung.RecordClasses;

import java.util.Set;

public record Employee(String name, int age, Set<String> projects) {
    public Employee(String name, int age) {
        this(name, age, null);
    }
}
