package com.chapter.monolith.DoctorRatingApp.controllers;

import com.chapter.monolith.DoctorRatingApp.entities.Doctor;
import com.chapter.monolith.DoctorRatingApp.services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST controller for managing doctors.
 */
@RestController
@RequestMapping("/doctors")
public class DoctorController {
    @Autowired
    private DoctorService doctorService;

    /**
     * Creates a new doctor by saving the provided doctor object.
     *
     * @param doctor The doctor object to be created
     * @return A ResponseEntity object containing the created doctor and a status code of 201 (CREATED)
     */
    @PostMapping
    public ResponseEntity<Doctor> createDoctor(@RequestBody Doctor doctor){
        return ResponseEntity.status(HttpStatus.CREATED).body(doctorService.saveDoctor(doctor));
    }

    
    /**
     * Retrieves the details of a doctor with the given doctorId.
     *
     * @param doctorId The unique identifier of the doctor.
     * @return A ResponseEntity containing the doctor details if found, or an empty body with an appropriate status code if not found.
     */
    @GetMapping("/{doctorId}")
    public ResponseEntity<Doctor> getDoctor(@PathVariable String doctorId){
        Doctor user = doctorService.getDoctor(doctorId);
        return ResponseEntity.ok(user);
    }

   
    /**
     * Retrieves all doctors from the database.
     *
     * @return A ResponseEntity containing a list of Doctor objects and an HTTP status code of 200 (OK).
     */
    @GetMapping
    public ResponseEntity<List<Doctor>> getAllDoctor(){
        List<Doctor> users = doctorService.getAllDoctor();
        return ResponseEntity.ok(users);
    }
}

