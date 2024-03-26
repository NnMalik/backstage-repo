package com.chapter.monolith.DoctorRatingApp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Data;

import java.util.ArrayList;


/**
 * Represents a user in the Monolith system.
 *
 * This class is annotated with @Entity to indicate that it is a persistent entity
 * that can be stored in a database. The @Table annotation specifies the name of the
 * database table where the user records will be stored.
 *
 * The class includes the following properties:
 * - userId: The unique identifier of the user.
 * - name: The name of the user.
 * - email: The email address of the user.
 * - about: A brief description or bio of the user.
 * - ratings: An ArrayList of Rating objects, representing the ratings given by the user.
 *   The @Transient annotation indicates that this property should not be persisted in the database.
 *
 */
@Entity
@Table(name = "monolith_users")
@Data
public class User {
    @Id
    private String userId;
    private String name;
    private String email;
    private String about;
    @Transient
    private ArrayList<Rating> ratings;
}
