package com.bisaga.sakila.errors;

public class EntityNotFoundException extends SakilaException {

    public EntityNotFoundException(String message){
        super(message);
    }

}
