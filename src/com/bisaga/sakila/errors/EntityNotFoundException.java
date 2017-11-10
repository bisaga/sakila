package com.bisaga.sakila.errors;

public class EntityNotFoundException extends Exception {

    public EntityNotFoundException(String message){
        super(message);
    }

}
