package cat.tecnocampus.notes2425.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.List;

/*
public record UserLab(long id, String username, String email) {
 }
 */

@Entity
@Table(name ="user_lab")
public record  UserLab (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long id,

        @NotNull
        @Column (unique = true, nullable = false)
        String username,

        @NotNull
        @Column (unique = true,nullable = false)
        String email

){

}