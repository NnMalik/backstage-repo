package com.chapter.monolith.DoctorRatingApp.services;

import com.chapter.monolith.DoctorRatingApp.entities.Rating;
import com.chapter.monolith.DoctorRatingApp.repositories.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RatingServiceImpl implements RatingService{

    @Autowired
    private RatingRepository ratingRepository;
    @Override
    public Rating saveRating(Rating rating) {
        String id= UUID.randomUUID().toString();
        rating.setRatingId(id);
        return ratingRepository.save(rating);
    }

    @Override
    public List<Rating> getAllRating() {
        return ratingRepository.findAll();
    }

    @Override
    public List<Rating> getAllRatingByUser(String id) {
        return ratingRepository.findByUserId(id);
    }

    @Override
    public List<Rating> getAllRatingByDoctor(String id) {
        return ratingRepository.findByDoctorId(id);
    }
}

