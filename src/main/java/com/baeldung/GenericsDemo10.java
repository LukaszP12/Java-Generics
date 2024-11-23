package com.baeldung;

import java.util.ArrayList;
import java.util.List;

class GenericsDemo10 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.addAll(List.of(1,2,3,4,5));

//        GenericUtil.printList(integers); this throws a compilations error as inheritance does not work with lists
    }
}
