package tn.esprit.medsadokmestiri4ds3.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.medsadokmestiri4ds3.entities.Course;
import tn.esprit.medsadokmestiri4ds3.repositories.ICourseRepository;
import tn.esprit.medsadokmestiri4ds3.repositories.IPisteRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class CourseServiceImpl implements ICourseServices{
    private ICourseRepository courseRepository;
    @Override
    public List<Course> retrieveAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Course addCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public Course updateCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public Course retrieveCourse(Long numCourse) {
        return courseRepository.findById((numCourse)).orElse(null);
    }
    @Override
    public void deleteCourse(long id) {
        courseRepository.deleteById(id);
    }
}
