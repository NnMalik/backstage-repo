package com.chapter.monolith.DoctorRatingApp.controllers;

import com.chapter.monolith.DoctorRatingApp.entities.Rating;
import com.chapter.monolith.DoctorRatingApp.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    @Autowired
    private RatingService ratingService;

    /**
     *
     * @param rating
     * @return
     */
    @PostMapping
    public ResponseEntity<Rating> createRating(@RequestBody Rating rating){
        return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.saveRating(rating));
    }

    /**
     * Retrieves all ratings from the database.
     *
     * @return A ResponseEntity containing a list of Rating objects, or an empty list if no ratings are found.
     */
    @GetMapping
    public ResponseEntity<List<Rating>> getAllRating(){
        List<Rating> users = ratingService.getAllRating();
        return ResponseEntity.ok(users);
    }

    /**
     * Retrieves all ratings associated with a specific user.
     *
     * @param userId The ID of the user.
     * @return A ResponseEntity containing a list of Rating objects associated with the user.
     */
    @GetMapping("users/{userId}")
    public ResponseEntity<List<Rating>> getAllRatingByUserId(@PathVariable String userId){
        List<Rating> users = ratingService.getAllRatingByUser(userId);
        return ResponseEntity.ok(users);
    }
    @GetMapping("doctors/{doctorId}")
    public ResponseEntity<List<Rating>> getAllRatingByDoctorId(@PathVariable String doctorId){
        List<Rating> users = ratingService.getAllRatingByDoctor(doctorId);
        return ResponseEntity.ok(users);
    }
}
