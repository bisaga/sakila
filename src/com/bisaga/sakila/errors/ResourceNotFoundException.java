package com.bisaga.sakila.errors;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String resourceName) {
        super(resourceName);
    }
}

