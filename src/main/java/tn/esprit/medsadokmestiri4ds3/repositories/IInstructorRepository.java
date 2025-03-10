package tn.esprit.medsadokmestiri4ds3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import tn.esprit.medsadokmestiri4ds3.entities.Instructor;


public interface IInstructorRepository extends JpaRepository<Instructor, Long> {
}
