package com.baeldung;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class GenericsDemo10 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.addAll(List.of(1, 2, 3, 4, 5));

//        GenericUtil.printList(integers); this throws a compilations error as inheritance does not work with lists

        // print list of Integers
        List<Integer> integers1 = List.of(1, 2, 3, 4, 5);
        GenericUtil.printList(integers1);

        // print list of Strings
        List<String> strings = List.of("Apple", "Grape");
        GenericUtil.printList(strings);

        // print list of Generic Pairs
        MutablePair<Integer> e1 = new MutablePair<>(1, 3);
        MutablePair<String> e2 = new MutablePair<>("A", "B");
        List<Object> pairs = List.of(e1, e2);
        GenericUtil.printList(pairs);

        // List of GenericPaid of Unknown type
        List<MutablePair<?>> pairs1 = List.of(e1, e2);
    }
}
