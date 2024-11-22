package com.baeldung;

class MutableNumberPair<T extends Number> {

    private T first;
    private T second;

    public MutableNumberPair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public void copyFrom(MutableNumberPair<T> from) {
        this.first = from.getFirst();
        this.second = from.getSecond();
    }

    @Override
    public String toString() {
        return "MutableNumberPair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
