package com.baeldung;

import java.util.List;

public class GenericUtil {

    public static <T extends Number> double sum(List<T> elements) {

        double value = 0;
        for (T e : elements) {
            value += e.doubleValue();
        }

        return value;
    }

    public long sumInt(List<Integer> elements) {
        long sum = 0;
        for (Integer e : elements) {
            sum += e;
        }
        return sum;
    }

    public double sumFloat(List<Float> elements) {
        double sum = 0;
        for (Float e : elements) {
            sum += e;
        }
        return sum;
    }
}
