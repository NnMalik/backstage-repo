package com.chapter.monolith.DoctorRatingApp.services;


import com.chapter.monolith.DoctorRatingApp.entities.Doctor;
import com.chapter.monolith.DoctorRatingApp.repositories.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * Implementation of the DoctorService interface that provides CRUD operations for doctors.
 */
@Service
public class DoctorServiceImpl implements DoctorService{
    @Autowired
    private DoctorRepository doctorRepository;

    /**
     * Saves a doctor entity to the database.
     *
     * @param doctor The doctor entity to be saved.
     * @return The saved doctor entity with a generated doctorId.
     */
    @Override
    public Doctor saveDoctor(Doctor doctor) {
        String id= UUID.randomUUID().toString();
        doctor.setDoctorId(id);
        return doctorRepository.save(doctor);
    }

    /**
     * Retrieves a list of all doctors.
     *
     * @return A list of Doctor objects representing all doctors in the system.
     */
    @Override
    public List<Doctor> getAllDoctor() {
        return doctorRepository.findAll();
    }

    /**
     * Retrieves a doctor by their ID from the doctor repository.
     *
     * @param id The ID of the doctor to retrieve.
     * @return The doctor with the specified ID.
     * @throws NoSuchElementException if no doctor with the specified ID is found.
     */
    @Override
    public Doctor getDoctor(String id) {
        return doctorRepository.findById(id).orElseThrow();
    }
}

