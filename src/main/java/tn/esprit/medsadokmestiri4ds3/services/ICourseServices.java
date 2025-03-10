package tn.esprit.medsadokmestiri4ds3.services;

import tn.esprit.medsadokmestiri4ds3.entities.Course;

import java.util.List;

public interface ICourseServices {
    List<Course> retrieveAllCourses();
    Course addCourse(Course  course);
    Course updateCourse(Course course);
    Course retrieveCourse(Long numCourse);
    void deleteCourse(long id);
}
