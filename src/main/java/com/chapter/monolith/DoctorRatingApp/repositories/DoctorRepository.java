package com.chapter.monolith.DoctorRatingApp.repositories;

import com.chapter.monolith.DoctorRatingApp.entities.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for managing Doctor entities.
 * Extends JpaRepository to inherit basic CRUD operations and querying capabilities.
 *
 * @param <Doctor> The entity type for the repository
 * @param <String> The type of the primary key of the entity
 */
public interface DoctorRepository extends JpaRepository<Doctor,String> {
}
