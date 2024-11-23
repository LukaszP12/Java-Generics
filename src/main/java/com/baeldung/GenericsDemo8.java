package com.baeldung;

/*
Erasure demo, as during compile time all bounded classes are converted to Object
and later casted to corresponding class
 */
class GenericsDemo8 {

    public static void main(String[] args) {
        // Create a GenericPair of Integer (T -> Integer)
        GenericPair<Integer> pair1 = new GenericPair<>(1, 1);

        // Create a GenericPair of String (T -> String)
        GenericPair<String> pair2 = new GenericPair<>("Apple", "Apple");

        // Output -> "Class Name : com.generics.generictype.GenericPair"
        System.out.println("Pair1 Class Name: " + pair1.getClass().getName());
        System.out.println("Pair2 Class Name: " + pair2.getClass().getName());

        // Output -> TRUE for both
        System.out.println(pair1.getClass().equals(pair2.getClass()));
        System.out.println(pair1.getClass() == pair2.getClass());
    }
}
