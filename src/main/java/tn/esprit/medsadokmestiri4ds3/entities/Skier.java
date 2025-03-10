package tn.esprit.medsadokmestiri4ds3.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Skier implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long numSkier;
    String firstName;
    String lastName;
    LocalDate dateOfBirth;
    String city;
    @OneToOne
    Subscription subscription;
    @OneToMany(mappedBy = "skier")
    Set<Registration> registrations;
    @ManyToMany(mappedBy = "skiers")
    Set<Piste> pistes;

}
