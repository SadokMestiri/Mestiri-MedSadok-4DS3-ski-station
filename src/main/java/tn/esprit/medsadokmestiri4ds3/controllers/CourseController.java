package tn.esprit.medsadokmestiri4ds3.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.medsadokmestiri4ds3.entities.Course;
import tn.esprit.medsadokmestiri4ds3.entities.Piste;
import tn.esprit.medsadokmestiri4ds3.services.ICourseServices;
import tn.esprit.medsadokmestiri4ds3.services.IPisteServices;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("course")
public class CourseController {
    private ICourseServices courseServices;
    @GetMapping("all")
    public List<Course> retrieveAll(){
        return courseServices.retrieveAllCourses();
    }
    @PostMapping("add")
    public Course addCourse(@RequestBody Course course){
        return courseServices.addCourse(course);
    }
    @PutMapping("update")
    public Course updateCourse(@RequestBody Course course){
        return courseServices.updateCourse(course);
    }
    @GetMapping("get/{numCourse}")
    public Course retrieveCourse(@PathVariable Long numCourse){
        return courseServices.retrieveCourse(numCourse);
    }
    @DeleteMapping("remove/{numCourse}")
    void removeCourse(@PathVariable("numCourse") Long numCourse) {
        courseServices.deleteCourse(numCourse);
    }
}
