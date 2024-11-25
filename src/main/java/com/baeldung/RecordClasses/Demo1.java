package com.baeldung.RecordClasses;

class Demo1 {
    public static void main(String[] args) {
        Employee martin = new Employee("Martin", 20);
        System.out.println("name: " + martin.name() + " age: " + martin.age());
    }
}
