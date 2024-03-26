package com.chapter.monolith.DoctorRatingApp.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

/**
 * generic api response structure which contains message, success, status
 */
@Data
@Builder
public class CommonResponse {
    private String message;
    private Boolean success;
    private HttpStatus status;

    /**
     * parameterized constructor
     * @param message
     * @param success
     * @param status
     */
    public CommonResponse(String message, Boolean success, HttpStatus status) {
        this.message = message;
        this.success = success;
        this.status = status;
    }
}
