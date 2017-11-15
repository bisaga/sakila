package com.bisaga.sakila.errors;


/*
Sakila exception base class extends RuntimeException (not Exception!) because we want to work with unchecked exceptions.
Unchecked exceptions (which are RuntimeException based) are sufficient and did not clutter the code
http://www.artima.com/intv/handcuffs.html
 */
public class SakilaException extends RuntimeException {

    public SakilaException(String message) {
        super(message);
    }

}
