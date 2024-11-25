package com.baeldung.NestedClasses;

class Demo1 {
    public static void main(String[] args) {
        Parent parent = new Parent("member1", "member2");
        parent.createChild("child1");
    }
}
