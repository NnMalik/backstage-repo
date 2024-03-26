package com.chapter.monolith.DoctorRatingApp.repositories;

import com.chapter.monolith.DoctorRatingApp.entities.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Repository interface for managing ratings.
 * Extends JpaRepository to inherit basic CRUD operations.
 */
public interface RatingRepository extends JpaRepository<Rating,String> {
    List<Rating> findByUserId(String userId);
    List<Rating> findByDoctorId(String doctorId);
}