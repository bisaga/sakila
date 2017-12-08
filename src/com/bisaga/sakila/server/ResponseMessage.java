package com.bisaga.sakila.server;

public class ResponseMessage<V> {
    private final String message;
    private final V value;

    public ResponseMessage(V value, String message) {
        this.message = message;
        this.value = value;
    }

    public String getMessage() {
        return  message;
    }
    public V getValue() {
        return  value;
    }
}
