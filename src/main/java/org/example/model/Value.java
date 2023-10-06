package org.example.model;

public enum Value {
    MIN(1),
    MAX(10);

    private final int value;

    Value(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
