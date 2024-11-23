package com.baeldung;

class MutablePair<T> {

    private T first;
    private T second;

    public MutablePair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public <S extends T> void copyFrom(MutablePair<S> from) {
        this.first = from.getFirst();
        this.second = from.getSecond();
    }

    @Override
    public String toString() {
        return "MutablePair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
