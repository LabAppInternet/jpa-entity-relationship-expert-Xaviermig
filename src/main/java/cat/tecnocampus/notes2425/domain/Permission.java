package cat.tecnocampus.notes2425.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

/*
public record Permission(UserLab owner, Note note, boolean canRead, boolean canEdit) {
 }
 */
@Entity
@Table(name = "permission")
public record Permission(

        @ManyToOne
        @Id
        @JoinColumn(name ="user_id")
        UserLab owner,

        @ManyToOne
        @Id
        @JoinColumn(name = "note_id")
        Note note,

        @NotNull
        @Column (name ="canRead",nullable = false)
        boolean canRead,

        @NotNull
        @Column (name = "canEdit",nullable = false)
        boolean canEdit




){

}


