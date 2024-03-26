package com.chapter.monolith.DoctorRatingApp.services;

import com.chapter.monolith.DoctorRatingApp.entities.Doctor;

import java.util.List;

public interface DoctorService {
    Doctor saveDoctor(Doctor user);

    List<Doctor> getAllDoctor();

    Doctor getDoctor(String id);
}
