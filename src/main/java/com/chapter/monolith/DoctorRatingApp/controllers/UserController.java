package com.chapter.monolith.DoctorRatingApp.controllers;

import com.chapter.monolith.DoctorRatingApp.entities.User;
import com.chapter.monolith.DoctorRatingApp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

           
@RestController
@RequestMapping("/users")
/**
 * Controller class for managing user-related operations.
 */
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * Creates a new user by saving the provided user object.
     *
     * @param user The user object to be created
     * @return A ResponseEntity object with the created user and a status code of 201 (CREATED)
     */
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.saveUser(user));
    }

    /**
     * Retrieves the user with the specified user ID.
     *
     * @param userId The ID of the user to retrieve.
     * @return A ResponseEntity containing the user if found, or an empty body with an appropriate status code if not found.
     */
    @GetMapping("/{userId}")
    public ResponseEntity<User> getUser(@PathVariable String userId){
        User user = userService.getUser(userId);
        return ResponseEntity.ok(user);
    }

    /**
     * Retrieves all users from the database.
     *
     * @return A ResponseEntity containing a list of User objects if successful, or an error response if unsuccessful.
     */
    @GetMapping
    public ResponseEntity<List<User>> getAllUser(){
        List<User> users = userService.getAllUser();
        return ResponseEntity.ok(users);
    }
}

