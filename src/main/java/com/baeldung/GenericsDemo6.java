package com.baeldung;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

class GenericsDemo6 {
    public static void main(String[] args) {
        ArrayList<Float> floats = new ArrayList<>();
        floats.add(3.12345F);
        floats.add(4.23445F);
        floats.add(5.215555F);

        double sum = GenericUtil.sum(floats);
        System.out.println("sum: " + sum);

        double value1 = GenericUtil.sum(List.of(1, 2, 3, 4)); // List of integers
        double value2 = GenericUtil.sum(List.of(1.8F, 1.2F, 8.9F, 9.0F)); // List of floats

        List<BigDecimal> elements = List.of(new BigDecimal(4.0), new BigDecimal(10.0));
        double values = GenericUtil.sum(elements);
        System.out.println("values: " + values);
    }
}
