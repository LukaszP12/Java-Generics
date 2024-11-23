package com.baeldung;

/*
Wildcards Demo
 */
class GenericsDemo7 {

    public static void main(String[] args) {
        MutablePair<Number> pair1 = new MutablePair<>(10, 1000);
        MutablePair<Number> pair2 = new MutablePair<>(400, 500);

        pair1.copyFrom(pair2);
        System.out.println("pair1 after copying from pair2: " + pair1);

        MutablePair<Float> pair3 = new MutablePair<>(3.0F, 4.0F);
        pair1.copyFrom(pair3);
    }
}
