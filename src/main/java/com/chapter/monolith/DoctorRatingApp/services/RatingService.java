package com.chapter.monolith.DoctorRatingApp.services;

import com.chapter.monolith.DoctorRatingApp.entities.Rating;

import java.util.List;

public interface RatingService {
    Rating saveRating(Rating rating);

    List<Rating> getAllRating();

    List<Rating> getAllRatingByUser(String id);

    List<Rating> getAllRatingByDoctor(String id);
}
