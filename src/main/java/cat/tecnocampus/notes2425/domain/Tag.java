package cat.tecnocampus.notes2425.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/*
public record Tag(String name) {
}
 */
@Entity
@Table(name= "tag")
public record Tag(
        @Id
        @Column(length = 255)
        String name
){

}



