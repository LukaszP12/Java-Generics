package com.baeldung;

import java.time.LocalDate;
import java.time.Month;
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

        // various implementations
        MutablePair<Integer> pair1 = new MutablePair<>(100, 300);
        var pair2 = new MutablePair<>(100, 300);
        MutablePair<?> pair3 = new MutablePair<Integer>(100, 300);
        MutablePair<? extends Integer> pair4 = new MutablePair<Integer>(100, 300);
        MutablePair<? extends Number> pair5 = new MutablePair<Integer>(100, 300);
        MutablePair<? extends Number> pair6 = new MutablePair<>(100, 300);

        MutablePair<String> cities = new MutablePair<>("New York", "Baltimore");
        GenericUtil.reset(cities, "DC");
        System.out.println(cities);

        MutablePair<Integer> intPair = new MutablePair<>(12, 24);
        GenericUtil.reset(intPair, 100);
        System.out.println(intPair);

        var date1 = LocalDate.of(2024, Month.MARCH, 15);
        var date2 = LocalDate.of(2024, Month.APRIL, 15);
        MutablePair<LocalDate> datePair = new MutablePair<>(date1, date2);
        GenericUtil.reset(datePair, LocalDate.now());
        System.out.println(datePair);

        // Pair of Number. Will this work ?
        MutablePair<Number> agePair = new MutablePair<>(45, 40);
        GenericUtil.reset(agePair, 0);
        System.out.println(agePair);
    }
}
