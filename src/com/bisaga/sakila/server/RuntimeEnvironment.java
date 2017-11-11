package com.bisaga.sakila.server;

public enum RuntimeEnvironment {
    UNDEFINED (0),
    PRODUCTION (1),
    DEVELOPMENT (2),
    TESTING (3)
    ; // end enum declaration section

    private final int value;

    RuntimeEnvironment(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
