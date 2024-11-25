package com.baeldung;

import java.math.BigDecimal;
import java.util.List;

class GenericsDemo12 {
    public static void main(String[] args) {
        var list = List.of(5, "New York");
        Integer integer = (Integer) list.get(0);
        System.out.println("integer: " + integer);

        String city = (String) list.get(1);
        System.out.println("city: " + city);

        // Intersection type
        // If T1,T2...Tn are types (classes or interfaces) in Java, then an
        // intersection Type is defined as
        // T1 & T2 & Tn

        // Inferred Intersection Type
        var result = switch (city) {
            case "New York" -> "Crazy";
            default -> BigDecimal.ZERO;
        };

        System.out.println("result: " + result);
    }
}
