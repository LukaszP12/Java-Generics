package com.baeldung;

class KeyValuePair {

    private final Number key;
    private final Object value;

    public KeyValuePair(Number key, Object value) {
        this.key = key;
        this.value = value;
    }

    public Number getKey() {
        return key;
    }

    public Object getValue() {
        return value;
    }
}
