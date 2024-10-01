package cat.tecnocampus.notes2425.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;
import java.util.Set;

/*
public record Note(Long id, UserLab owner, String title, String content, LocalDateTime creationDate, Set<Tag> tags) {
 }
 */
@Entity
@Table(name = "note")
public record Note(
        @Id
        @GeneratedValue (strategy =GenerationType.IDENTITY)
        Long id,

        @ManyToOne
        @JoinColumn(name = "owner_id", nullable = false)
        UserLab owner,

        @Column (nullable = false)
        @NotNull String title,

        @Column (nullable = false)
        @NotNull String content,

        @CreatedDate
        @Column(name = "creation_Date", nullable = false)
        LocalDateTime creationDate,

        @ManyToMany
        @JoinTable (name = "Note_Tag", joinColumns = @JoinColumn(name="note_id"),
                inverseJoinColumns = @JoinColumn(name= "tag_name"))
        Set<Tag> tags



) {




}
