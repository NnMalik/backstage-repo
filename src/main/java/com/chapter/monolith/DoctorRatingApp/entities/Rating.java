package com.chapter.monolith.DoctorRatingApp.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


/**
 * Represents a rating given by a user to a doctor.
 *
 * This class is annotated with @Entity to indicate that it is a persistent entity
 * that can be stored in a database. The @Table annotation specifies the name of the
 * database table where instances of this class will be stored.
 *
 * The class includes the following properties:
 * - ratingId: A unique identifier for the rating.
 * - userId: The ID of the user who gave the rating.
 * - doctorId: The ID of the doctor who received the rating.
 * - rating: The numerical rating given by the user.
 * - feedback: Additional feedback provided by the user.
 *
 * The class is annotated with @Data, which generates
 */
@Entity
@Table(name = "rating")
@Data
public class Rating {
    @Id
    private String ratingId;
    private String userId;
    private String doctorId;
    private int rating;
    private String feedback;
}
