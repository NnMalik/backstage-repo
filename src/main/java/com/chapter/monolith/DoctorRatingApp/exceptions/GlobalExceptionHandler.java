package com.chapter.monolith.DoctorRatingApp.exceptions;


import com.chapter.monolith.DoctorRatingApp.model.CommonResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Global exception handler for handling the ResourceNotFoundException.
 * This class is annotated with @RestControllerAdvice to handle exceptions globally.
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<CommonResponse> handleResourceNotFoundException(ResourceNotFoundException exception){
        CommonResponse response = CommonResponse.builder().message(exception.getMessage()).success(true).status(HttpStatus.NOT_FOUND).build();
        return new ResponseEntity<CommonResponse>(response,HttpStatus.NOT_FOUND);
    }
}

