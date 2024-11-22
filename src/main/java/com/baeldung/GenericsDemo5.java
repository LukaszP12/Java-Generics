package com.baeldung;

import java.math.BigDecimal;

class GenericsDemo5 {
    public static void main(String[] args) {
        MutablePair<String> pair1 = new MutablePair<>("Apple", "Banana");
        System.out.println("pair1 = " + pair1);

        MutablePair<String> pair2 = new MutablePair<>("Grape", "Orange");
        System.out.println("pair2 = " + pair2);

        System.out.println("Updating pair1 ..");
        pair1.copyFrom(pair2);
        System.out.println("pair1 = " + pair1);
        System.out.println("pair2 = " + pair2);


        pair2.copyFrom(new MutablePair(100, 200));

        String first = pair1.getFirst();
        String second = pair1.getSecond();

        // Type is automatically detected
        MutableNumberPair<Integer> integerMutableNumberPair = new MutableNumberPair<>(3, 3);
        MutableNumberPair<Float> floatMutableNumberPair = new MutableNumberPair<>(3.2F, 10.8F);

        BigDecimal bigDecimal = new BigDecimal(200.10);
        BigDecimal bigDecimal1 = new BigDecimal(300.90);
        MutableNumberPair<BigDecimal> bigDecimals = new MutableNumberPair<>(bigDecimal, bigDecimal1);
    }
}
