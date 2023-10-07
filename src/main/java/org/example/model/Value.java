package org.example.model;

public enum Value {
    MIN_VALUE(1),
    MAX_VALUE(10);

    private final int value;

    Value(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
