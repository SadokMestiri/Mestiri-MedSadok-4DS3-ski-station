package tn.esprit.medsadokmestiri4ds3.entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.List;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Course implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long numCourse;
    int level;
    @Enumerated(EnumType.STRING)
    TypeCourse typeCourse;
    @Enumerated(EnumType.STRING)
    Support support;
    Float price;
    int timeSki;
    @OneToMany(mappedBy = "course")
    List<Registration> registrations;
    //MAPPED BY DIMA YET7AT FEL CHILD(elli 3andou el one  1->*)!!!
    //List (bel duplication/doublons) Set sans doublons
}
