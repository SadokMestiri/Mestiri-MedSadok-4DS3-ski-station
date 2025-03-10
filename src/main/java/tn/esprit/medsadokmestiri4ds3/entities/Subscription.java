package tn.esprit.medsadokmestiri4ds3.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Subscription implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long numSub;
    LocalDate startDate;
    LocalDate endDate;
    Float price;
    @Enumerated(EnumType.STRING)
    TypeSubscription typeSub;
}
