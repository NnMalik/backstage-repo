package com.chapter.monolith.DoctorRatingApp.exceptions;

/**
 * Exception thrown when a requested resource is not found.
 */
public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(){
        super("Resource not found exception");
    }

    public ResourceNotFoundException(String message){
        super(message);
    }
}
