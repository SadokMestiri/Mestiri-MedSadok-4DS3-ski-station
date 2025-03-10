package tn.esprit.medsadokmestiri4ds3.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.medsadokmestiri4ds3.entities.Course;
import tn.esprit.medsadokmestiri4ds3.entities.Instructor;
import tn.esprit.medsadokmestiri4ds3.repositories.ICourseRepository;
import tn.esprit.medsadokmestiri4ds3.repositories.IInstructorRepository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@Service
public class InstructorServiceImpl implements IInstructorServices{
    private IInstructorRepository instructorRepository;
    private ICourseRepository courseRepository;
    @Override
    public List<Instructor> retrieveInstructors() {
        return instructorRepository.findAll();
    }

    @Override
    public Instructor addInstructor(Instructor instructor) {
        return instructorRepository.save(instructor);
    }

    @Override
    public Instructor updateInstructor(Instructor instructor) {
        return instructorRepository.save(instructor);
    }

    @Override
    public Instructor retrieveInstructor(Long numInstructor) {
        return instructorRepository.findById((numInstructor)).orElse(null);
    }
    @Override
    public void deleteInstructor(Long numInstructor){
        instructorRepository.deleteById(numInstructor);
    }
    @Override
    public Instructor addInstructorAndAssignToCourse(Instructor instructor, Long numCourse) {
        Course course = courseRepository.findById(numCourse).orElse(null);
        if (instructor.getCourses() != null) {
            instructor.getCourses().add(course);
        }
        else
        {
            Set<Course> courses = new HashSet<>();
            courses.add(course);
            instructor.setCourses(courses);
        }
        return instructorRepository.save(instructor);
    }
}
