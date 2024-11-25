package com.baeldung;

import java.util.List;

class GenericsDemo12 {
    public static void main(String[] args) {
        var list = List.of(5, "New York");
        Integer integer = (Integer) list.get(0);
        System.out.println("integer: " + integer);

        String city = (String) list.get(1);
        System.out.println("city: " + city);
    }
}
