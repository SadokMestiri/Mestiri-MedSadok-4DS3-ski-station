package tn.esprit.medsadokmestiri4ds3.services;

import tn.esprit.medsadokmestiri4ds3.entities.Instructor;

import java.util.List;

public interface IInstructorServices {
    List<Instructor> retrieveInstructors();
    Instructor addInstructor(Instructor instructor);
    Instructor updateInstructor (Instructor instructor);
    Instructor retrieveInstructor (Long numInstructor);
    void deleteInstructor(Long numInstructor);
    Instructor addInstructorAndAssignToCourse(Instructor instructor, Long numCourse);
}
