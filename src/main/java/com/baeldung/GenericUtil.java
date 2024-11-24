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

    public static <T> void printList(List<T> listObjects) {
        for (T obj : listObjects) {
            System.out.println(obj);
        }
    }

    public static void printListWildcard(List<?> listObjects) {
        for (Object obj : listObjects) {
            System.out.println(obj);
        }
    }

    public static <T> void reset(MutablePair<T> pair, T data) {
        pair.setFirst(data);
        pair.setSecond(data);
    }

    public static void resetToZero(MutablePair<Integer> pair) {
        pair.setFirst(0);
        pair.setSecond(0);
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
