package com.chapter.monolith.DoctorRatingApp.services;


import com.chapter.monolith.DoctorRatingApp.entities.Rating;
import com.chapter.monolith.DoctorRatingApp.entities.User;
import com.chapter.monolith.DoctorRatingApp.repositories.RatingRepository;
import com.chapter.monolith.DoctorRatingApp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Implementation of the UserService interface that provides methods for saving and retrieving user data.
 * This class uses the UserRepository and RatingRepository to interact with the underlying data storage.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RatingRepository ratingRepository;
    /**
     * Saves a user entity to the database.
     *
     * @param user The user entity to be saved.
     * @return The saved user entity with a generated user ID.
     */
    @Override
    public User saveUser(User user) {
        String id= UUID.randomUUID().toString();
        user.setUserId(id);
        return userRepository.save(user);
    }

    /**
     * Retrieves all users from the user repository.
     *
     * @return A list of all users.
     */
    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    /**
     * Retrieves a user by their ID and populates their ratings.
     *
     * @param id The ID of the user to retrieve.
     * @return The user object with populated ratings.
     * @throws NoSuchElementException if no user with the given ID is found.
     */
    @Override
    public User getUser(String id) {
        User user = userRepository.findById(id).orElseThrow();
        List<Rating> ratingOfUser = ratingRepository.findByUserId(id);
        user.setRatings((ArrayList<Rating>) ratingOfUser);
        return user;
    }
}

