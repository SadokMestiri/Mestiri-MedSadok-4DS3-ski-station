package tn.esprit.medsadokmestiri4ds3.entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.Set;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Piste implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long numPiste;
   // @Column(nullable = false,unique = true,length = 30)
    String namePiste;
    @Enumerated(EnumType.STRING)
    Color color;
    int length;
    int slope;
    @ManyToMany
    Set<Skier> skiers;

}
