package com.chapter.monolith.DoctorRatingApp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "doctor")
@Data
/**
 * Represents a Doctor entity.
 * 
 * This class is used to store information about a doctor, including their ID, name, specialization, and about section.
 * 
 * Properties:
 * - doctorId: The unique identifier for the doctor.
 * - name: The name of the doctor.
 * - specialization: The area of specialization for the doctor.
 * - about: A brief description or information about the doctor.
 */
public class Doctor {
    @Id
    private String doctorId;
    private String name;
    private String specialization;
    private String about;
}
