package tn.esprit.medsadokmestiri4ds3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import tn.esprit.medsadokmestiri4ds3.entities.Skier;

public interface ISkierRepository extends JpaRepository<Skier, Long> {
}
