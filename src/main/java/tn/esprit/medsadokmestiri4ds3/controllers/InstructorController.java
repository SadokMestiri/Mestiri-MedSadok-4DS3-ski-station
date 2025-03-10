package tn.esprit.medsadokmestiri4ds3.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.medsadokmestiri4ds3.entities.Course;
import tn.esprit.medsadokmestiri4ds3.entities.Instructor;
import tn.esprit.medsadokmestiri4ds3.services.ICourseServices;
import tn.esprit.medsadokmestiri4ds3.services.IInstructorServices;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("instructor")
public class InstructorController {
    private IInstructorServices instructorServices;
    @GetMapping("all")
    public List<Instructor> retrieveAll(){
        return instructorServices.retrieveInstructors();
    }
    @PostMapping("add")
    public Instructor addInstructor(@RequestBody Instructor instructor){
        return instructorServices.addInstructor(instructor);
    }
    @PutMapping("update")
    public Instructor updateInstructor(@RequestBody Instructor instructor){
        return instructorServices.updateInstructor(instructor);
    }
    @GetMapping("get/{numInstructor}")
    public Instructor retrieveInstructor(@PathVariable Long numInstructor){
        return instructorServices.retrieveInstructor(numInstructor);
    }
    @DeleteMapping("remove/{numInstructor}")
    void removeCourse(@PathVariable("numInstructor") Long numInstructor) {
        instructorServices.deleteInstructor(numInstructor);
    }
    @PostMapping("add/{courseId}")
    Instructor addInstructorAndAssignToCourse(@RequestBody Instructor instructor,@PathVariable Long courseId) {
        return instructorServices.addInstructorAndAssignToCourse(instructor, courseId);
    }
}
