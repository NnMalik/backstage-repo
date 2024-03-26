package com.chapter.monolith.DoctorRatingApp.services;

import com.chapter.monolith.DoctorRatingApp.entities.User;

import java.util.List;

/**
 * The UserService interface defines the contract for managing user-related operations.
 * It provides methods for creating, updating, deleting, and retrieving user information.
 * Implementations of this interface will handle the actual logic for these operations.
 */
public interface UserService {

    /**
     * Saves the user entity to the database.
     *
     * @param user The user entity to be saved.
     * @return The saved user entity.
     */
    User saveUser(User user);

    
    /**
     * Retrieves a list of all users.
     *
     * @return A list of User objects representing all users.
     */
    List<User> getAllUser();

   
    /**
     * Retrieves a user by their ID.
     *
     * @param id The ID of the user.
     * @return The user object associated with the given ID.
     */
    User getUser(String id);
}
