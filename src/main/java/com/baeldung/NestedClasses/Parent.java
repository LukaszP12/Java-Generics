package com.baeldung.NestedClasses;

public class Parent {

    private final String first;
    private final String last;

    public Parent(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public static class Child {
        private final String first;

        public Child(Parent parent, String first) {
            this.first = first;
        }

        public String getFullName() {
            return first;
        }
    }

    public void createChild(String first) {
        Child c = new Child(this, first);
        System.out.println("Child Name : " + c.getFullName());
    }
}
