package com.chapter.monolith.DoctorRatingApp.repositories;

import com.chapter.monolith.DoctorRatingApp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for managing User entities.
 * Extends JpaRepository to inherit basic CRUD operations.
 *
 * @param <User> The entity type for this repository
 * @param <String> The type of the primary key of the entity
 */
public interface UserRepository extends JpaRepository<User,String> {
        }
