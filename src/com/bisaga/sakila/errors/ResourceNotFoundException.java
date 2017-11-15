package com.bisaga.sakila.errors;

public class ResourceNotFoundException extends SakilaException {

    public ResourceNotFoundException(String resourceName) {
        super(resourceName);
    }
}

