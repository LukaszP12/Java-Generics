package com.baeldung.RecordClasses;

import java.util.HashSet;
import java.util.Set;

class Demo1 {
    public static void main(String[] args) {
        // Record classes do not have setters, so they are immutable
        Employee martin = new Employee("Martin", 20);
        System.out.println("name: " + martin.name() + " age: " + martin.age());

        // however record classes may contain references to other class, which could be mutable
        Set<String> projects = new HashSet<>();
        projects.add("Project X");
        projects.add("Project Y");
        projects.add("Project Z");
        Employee joeDoe = new Employee("Joe Doe", 25, projects);

        System.out.println(joeDoe);
    }
}
